package com.revature.rms.core.exceptions;

abstract class AuthenticationException extends ExceptionHandler{

    private int status;
    private String message;

    public AuthenticationException() {
        super(401, "An authentication error occurred.");
    }

    public AuthenticationException(String message) {
        super(401, message);
    }

    public AuthenticationException(int status, String message) {
        super(status, message);
    }
}
