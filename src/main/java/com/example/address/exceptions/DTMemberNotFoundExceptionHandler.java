package com.example.address.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class DTMemberNotFoundExceptionHandler {

    @ExceptionHandler(value = {DTMemberNotFoundException.class})
    private ResponseEntity<Object> handelDTMemberNotFoundException(DTMemberNotFoundException e){
        //create
        HttpStatus badRequest= HttpStatus.BAD_REQUEST;
        DTMemberException exception= new DTMemberException(
                e.getMessage(),

               badRequest,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        //return
        return  new ResponseEntity<>(exception,badRequest);
    }

}
