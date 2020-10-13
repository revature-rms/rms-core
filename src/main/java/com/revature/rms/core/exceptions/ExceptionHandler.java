package com.revature.rms.core.exceptions;

abstract class ExceptionHandler extends RuntimeException{

    private int status;
    private String message;
    private Throwable cause;

    public ExceptionHandler(int status) {
        super("Something has gone wrong.");
        this.status = status;
    }

    public ExceptionHandler(int status, String message) {
        super(message);
        this.status = status;
    }

    public ExceptionHandler(int status, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public abstract int getStatus();

    public abstract void setStatus(int status);

    public abstract String getString();

    public abstract void setString(String message);

    public abstract Throwable getCause();

    public abstract void setCause(Throwable cause);
}
