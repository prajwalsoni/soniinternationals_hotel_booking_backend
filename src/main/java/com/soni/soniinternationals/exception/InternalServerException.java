package com.soni.soniinternationals.exception;


@SuppressWarnings("serial")
public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message); 
    }
}
