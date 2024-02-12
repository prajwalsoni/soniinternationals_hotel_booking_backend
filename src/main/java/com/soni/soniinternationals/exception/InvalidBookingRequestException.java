package com.soni.soniinternationals.exception;


@SuppressWarnings("serial")
public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
