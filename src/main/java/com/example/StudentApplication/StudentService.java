package com.example.StudentApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepo;

    public StudentService(StudentRepository studentRepo){this.studentRepo = studentRepo;}

    public void submit(Student student){studentRepo.save(student);}

    public List<Student> getData(){return studentRepo.findAll();}

    public void deleteData(){studentRepo.deleteAll();}
    public List<Student> findByCouseAndYear(String course , int year){return studentRepo.findByCourseAndYear(course , year);}
}
