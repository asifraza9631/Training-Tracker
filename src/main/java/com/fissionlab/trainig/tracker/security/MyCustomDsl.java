package com.fissionlab.trainig.tracker.security;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.access.ExceptionTranslationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;



public class MyCustomDsl extends AbstractHttpConfigurer<MyCustomDsl, HttpSecurity> {

    private TokenService tokenService;

    public MyCustomDsl(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        AuthenticationManager authenticationManager = http.getSharedObject(AuthenticationManager.class);
        http.addFilterBefore(new SecurityLoginFilter(new AntPathRequestMatcher("/social", "POST"),
                authenticationManager, tokenService), UsernamePasswordAuthenticationFilter.class);
        http.addFilterAfter(new SecurityAuthValidationFilter(tokenService), ExceptionTranslationFilter.class);
    }

    public static MyCustomDsl customDsl(TokenService tokenService) {
        return new MyCustomDsl(tokenService);
    }
}
