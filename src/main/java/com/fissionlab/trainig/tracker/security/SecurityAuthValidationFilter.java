package com.fissionlab.trainig.tracker.security;

import java.io.IOException;
import java.util.Collections;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class SecurityAuthValidationFilter extends GenericFilterBean {

    TokenService tokenService;

    public SecurityAuthValidationFilter(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {

        if (request.getRequestURI().equals("/health")) {
            chain.doFilter(request, response);
        }

        final String authorizationHeader = request.getHeader("Authorization");

        String jwt = null;

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {

            jwt = authorizationHeader.substring(7);

            Claims claim = tokenService.getAllClaims(jwt);
            if (claim != null) {
                GoogleAuthToken token = new GoogleAuthToken(claim.get("id"), null, null,

                        Collections.singleton(new SimpleGrantedAuthority((String) claim.get("role"))));
                SecurityContextHolder.getContext().setAuthentication(token);
                chain.doFilter(request, response);

            }

        } else {

            throw new tokenExpirationException("problem with bearer");

        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        doFilterInternal((HttpServletRequest) request, (HttpServletResponse) response, chain);

    }

}


