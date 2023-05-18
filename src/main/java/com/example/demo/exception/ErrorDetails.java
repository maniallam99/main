package com.example.demo.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Date;
@Data
public class ErrorDetails {
    public ErrorDetails(String code, String messgae, Date timestamp) {
        this.code = code;
        this.messgae = messgae;
        this.timestamp = timestamp;
    }

    private String code;
    private String messgae;
    private Date timestamp;




}
