package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {


@ExceptionHandler(ServiceExceptionb.class)
    public ResponseEntity<Object> handleid(ServiceExceptionb ex){
//here we need to create another class as to pass it as object in return
    ErrorDetails errorDetails= new ErrorDetails(ex.getCode(),ex.getMessage(),new Date());


        return new ResponseEntity<>(errorDetails, ex.getStatus());

    }
}
