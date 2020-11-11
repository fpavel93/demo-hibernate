package com.naya.demohibernate.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue
    long id;
    String name;
    @Transient
    int age;

}
