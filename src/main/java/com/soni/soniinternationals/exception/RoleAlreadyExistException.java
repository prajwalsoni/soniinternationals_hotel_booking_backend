package com.soni.soniinternationals.exception;



@SuppressWarnings("serial")
public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
