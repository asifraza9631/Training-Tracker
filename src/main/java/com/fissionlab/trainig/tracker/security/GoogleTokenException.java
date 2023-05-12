package com.fissionlab.trainig.tracker.security;
import org.springframework.security.core.AuthenticationException;

public class GoogleTokenException extends AuthenticationException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs an <code>AuthenticationServiceException</code> with the specified
     * message.
     *
     * @param msg the detail message
     */
    public GoogleTokenException(String msg) {
        super(msg);
    }

    /**
     * Constructs an <code>AuthenticationServiceException</code> with the specified
     * message and root cause.
     *
     * @param msg   the detail message
     * @param cause root cause
     */
    public GoogleTokenException(String msg, Throwable cause) {
        super(msg, cause);
    }

}

