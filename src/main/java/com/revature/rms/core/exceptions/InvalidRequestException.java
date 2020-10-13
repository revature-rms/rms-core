package com.revature.rms.core.exceptions;

abstract class InvalidRequestException extends ExceptionHandler{

    private int status;
    private String message;

    public InvalidRequestException() {
        super(400, "An invalid request was made.");
    }

    public InvalidRequestException(String message) {
        super(400, message);
    }

    public InvalidRequestException(int status, String message) {
        super(status, message);
    }
}
