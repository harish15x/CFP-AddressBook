package com.bridgelabz.addressbookprogram.exception.exception;

import com.bridgelabz.addressbookprogram.exception.AddressBookException;
import com.bridgelabz.addressbookprogram.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AddressBookExceptionHandler {
    @ExceptionHandler(AddressBookException.class)
    public ResponseEntity<ResponseUtil> handlerHiringException(AddressBookException exception) {
        ResponseUtil response = new ResponseUtil();
        response.setErrorCode(400);
        response.setMessage(exception.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}