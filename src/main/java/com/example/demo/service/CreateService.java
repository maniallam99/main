package com.example.demo.service;

import com.example.demo.Entity.table1;
import com.example.demo.exception.ServiceExceptionb;
import com.example.demo.repository.table1repository;
import com.example.demo.response.Createresponse;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateService {

    private final table1repository table1repository;
    private final Createresponse createresponse;

    public Createresponse createRecord(table1 table1) {

        if(table1.getId()==1){
       throw new ServiceExceptionb("servicemessgae","123", HttpStatus.BAD_REQUEST);
        }
        table1repository.save(table1);
        createresponse.setSuccess("Success");

        return createresponse;
    }
}
