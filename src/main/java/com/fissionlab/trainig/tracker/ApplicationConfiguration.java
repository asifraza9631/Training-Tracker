package com.fissionlab.trainig.tracker;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ApplicationConfiguration implements WebMvcConfigurer {

    private final RequestIdInterceptor mdcInterceptor = new RequestIdInterceptor();

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(mdcInterceptor);
    }

}

