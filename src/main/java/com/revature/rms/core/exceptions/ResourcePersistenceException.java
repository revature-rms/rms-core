package com.revature.rms.core.exceptions;

public class ResourcePersistenceException extends RuntimeException {

    public ResourcePersistenceException(){ super("Resource failed to persist");}

    public ResourcePersistenceException(String message){ super(message);}
}
