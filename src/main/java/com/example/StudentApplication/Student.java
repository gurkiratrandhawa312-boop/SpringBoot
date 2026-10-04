package com.example.StudentApplication;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {

    @Id
    private String id;

    private String name;
    private String course;
    private int year;

    public void setName(String name){this.name = name;}
    public void setCourse(String course){this.course = course;}
    public void setYear(int year){this.year = year;}

    public String getName(){return name;}
    public String getCourse(){return course;}
    public int getYear(){return year;}
}