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

String a1="f2";

    String b5="f5";

    String a4="f4";
    String a8="f5";


    String a7="f4";







    @PostMapping("/create")
    public Createresponse createrecord(@RequestBody table1 table1){


       return createService.createRecord(table1);

    }

}
