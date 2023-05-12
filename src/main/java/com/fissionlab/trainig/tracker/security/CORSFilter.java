package com.fissionlab.trainig.tracker.security;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Samarendra
 *
 */
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        if ("OPTIONS".equals(request.getMethod())) {
            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD, PATCH");
            response.addHeader("Access-Control-Allow-Headers",
                    "origin, content-type, accept, authorization, clientId, X-AUTH-TOKEN, cognitoToken, x-datadog-trace-id, x-datadog-parent-id, x-datadog-origin, x-datadog-sampling-priority, x-datadog-sampled, accessToken");
            response.addHeader("Access-Control-Max-Age", "1800");
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Allow-Credentials", "true");
            response.addHeader("Access-Control-Expose-Headers", "X-AUTH-TOKEN, Date, accessToken");
            return;
        }
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS, HEAD, DELETE, PATCH");
        response.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, Authorization, clientId, X-AUTH-TOKEN, cognitoToken, x-datadog-trace-id, x-datadog-parent-id, x-datadog-origin, x-datadog-sampling-priority, x-datadog-sampled, accessToken");
        response.addHeader("Access-Control-Max-Age", "1800");
        response.addHeader("Access-Control-Allow-Credentials", "true");
        response.addHeader("Access-Control-Expose-Headers", "Authorization,X-AUTH-TOKEN, Date, accessToken");
        filterChain.doFilter(request, response);

    }
}
