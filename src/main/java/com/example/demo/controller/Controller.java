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
    String a="a" ;
    String b="2";
    String c="2";
    String e="3";
    String d="4";
    String f="changed in feature3";
    String g="changed second time";
    String i="changed in 2";
    String h="change in 2";

    String k="change in 1";
    String j="change in 1";
    String m="change in 1";


    String l="change in 2";


    String l="change in 2";
    String n="change in 2";





    @PostMapping("/create")
    public Createresponse createrecord(@RequestBody table1 table1){


       return createService.createRecord(table1);

    }

}
