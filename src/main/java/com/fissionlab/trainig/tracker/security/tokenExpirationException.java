package com.fissionlab.trainig.tracker.security;

import org.springframework.security.access.AccessDeniedException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class tokenExpirationException extends AccessDeniedException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;




    public tokenExpirationException(String message) {
        super(message);

    }




}