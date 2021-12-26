package com.venkat.samplespringbootmvc.entity;
import  javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    public int Id;

    @Column(name = "student_name")
    public String Name;

    public void setName(String name) {
        Name = name;
    }
}
