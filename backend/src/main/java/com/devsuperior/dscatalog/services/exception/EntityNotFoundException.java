package com.devsuperior.dscatalog.services.exception;

public class EntityNotFoundException extends RuntimeException{
    private static final long serialVerionUID = 1L;

    public EntityNotFoundException(String msg){
        super(msg);
    }
}
