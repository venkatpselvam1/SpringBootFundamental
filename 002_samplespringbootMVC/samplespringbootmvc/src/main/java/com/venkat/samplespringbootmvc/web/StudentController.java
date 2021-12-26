package com.venkat.samplespringbootmvc.web;

import com.venkat.samplespringbootmvc.entity.Student;
import com.venkat.samplespringbootmvc.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private StudentRepository studentRepository;
    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public String getAllStudents()
    {
        var ans = "";
        var students = this.studentRepository.findAll();
        for(var student: students)
        {
            ans+= student.toString() +"..........................";
        }
        return ans;
    }
}
