package com.devsuperior.dscatalog.services.exception;

public class DatabaseException extends RuntimeException{
    private static final long serialVerionUID = 1L;

    public DatabaseException(String msg){
        super(msg);
    }
}
