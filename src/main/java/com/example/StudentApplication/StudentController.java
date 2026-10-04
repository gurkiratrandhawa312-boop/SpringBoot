package com.example.StudentApplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/data")
    public void submit(@RequestBody Student student){studentService.submit(student);}

    @GetMapping("/datas")
    public List<Student> getData(){return studentService.getData();}

    @DeleteMapping("/data")
    public void deleteData(){studentService.deleteData();}

    @GetMapping("/data")
    public List<Student> getData(@RequestParam String course , @RequestParam int year){return studentService.findByCouseAndYear(course , year);}
}
