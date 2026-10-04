package com.example.StudentApplication;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student , String> {

    List<Student> findByCourseAndYear(String course , int year);
}
