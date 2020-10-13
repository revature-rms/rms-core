package com.revature.rms.core.exceptions;

abstract class AuthorizationException extends ExceptionHandler{

    private int status;
    private String message;

    public AuthorizationException() {
        super(403, "An authorization exception occurred.");
    }

    public AuthorizationException(String message) {
        super(403, message);
    }

    public AuthorizationException(int status, String message) {
        super(status, message);
    }
}
