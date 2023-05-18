package com.example.demo.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;


@Component
@Getter
@Setter
public class ServiceExceptionb extends RuntimeException{
    private static final long serialVersionUID=1L;
    private String message;
    private String code;
    private HttpStatus status;

    public ServiceExceptionb() {

    }


    public ServiceExceptionb(String s, String s1) {
    }

    public ServiceExceptionb(String servicemessgae, String s, HttpStatus badRequest) {
        this.code=s;
        this.status=badRequest;
        this.message=servicemessgae;
    }
}
