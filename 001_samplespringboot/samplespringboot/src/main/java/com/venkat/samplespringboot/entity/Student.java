package com.venkat.samplespringboot.entity;
import  javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    public int Id;

    @Column(name = "student_name")
    public String Name;
}
