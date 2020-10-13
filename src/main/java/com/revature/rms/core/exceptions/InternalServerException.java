package com.revature.rms.core.exceptions;

abstract class InternalServerException extends ExceptionHandler{

    private int status;
    private String message;

    public InternalServerException() {
        super(500, "Something happened in the server, our apologies.");
    }

    public InternalServerException(String message) {
        super(500, message);
    }

    public InternalServerException(int status, String message) {
        super(status, message);
    }
}
