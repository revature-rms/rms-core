package com.revature.rms.core.exceptions;

abstract class AuthenticationException extends ExceptionHandler{

    private int status;
    private String message;

    public AuthenticationException() {
        super(401, "Authentication failed...");
    }

    public AuthenticationException(String message) {
        super(401, message);
    }
}
