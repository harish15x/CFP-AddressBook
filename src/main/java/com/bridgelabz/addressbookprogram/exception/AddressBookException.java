package com.bridgelabz.addressbookprogram.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class AddressBookException extends RuntimeException {
    private int statusCode;
    private String statusMessage;

    public AddressBookException(int statusCode, String statusMessage) {
        super(statusMessage);
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }
}