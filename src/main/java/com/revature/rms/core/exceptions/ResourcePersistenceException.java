package com.revature.rms.core.exceptions;

abstract class ResourcePersistenceException extends ExceptionHandler{

    private int status;
    private String message;

    public ResourcePersistenceException() {
        super(409, "Resource did not persist.");
    }

    public ResourcePersistenceException(String message) {
        super(409, message);
    }

    public ResourcePersistenceException(int status, String message) {
        super(status, message);
    }
}
