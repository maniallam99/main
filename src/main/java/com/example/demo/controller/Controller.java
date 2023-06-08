package com.example.demo.controller;

import com.example.demo.Entity.table1;
import com.example.demo.response.Createresponse;
import com.example.demo.service.CreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor

public class Controller {

    private final CreateService createService;


  






    @PostMapping("/create")
    public Createresponse createrecord(@RequestBody table1 table1){


       return createService.createRecord(table1);

    }

}
