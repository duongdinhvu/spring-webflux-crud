package com.webflux.demowebflux.entity;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
public class Employee {

    @Id
    private Long id;
    private String name;
    private String address;
}
