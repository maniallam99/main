package com.example.demo.repository;

import com.example.demo.Entity.table1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface table1repository extends JpaRepository<table1,Integer> {
}
