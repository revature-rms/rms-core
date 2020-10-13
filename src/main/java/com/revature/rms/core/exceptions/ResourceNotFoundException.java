package com.revature.rms.core.exceptions;

abstract class ResourceNotFoundException extends ExceptionHandler{

    private int status;
    private String message;

    public ResourceNotFoundException() {
        super(404, "No resource found.");
    }

    public ResourceNotFoundException(String message) {
        super(404, message);
    }

    public ResourceNotFoundException(int status, String message) {
        super(status, message);
    }
}
