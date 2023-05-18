package com.example.demo.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Table(schema="public",name="table1")
@Entity
@Data
public class table1 {
  @Id
    private int Id;
    private String name;
    private int age;

}
