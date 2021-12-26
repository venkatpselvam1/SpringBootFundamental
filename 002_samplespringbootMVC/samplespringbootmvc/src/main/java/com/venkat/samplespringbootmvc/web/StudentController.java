package com.venkat.samplespringbootmvc.web;

import com.venkat.samplespringbootmvc.entity.Student;
import com.venkat.samplespringbootmvc.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/api/students")
    public List<Student> getAllStudentsInApi()
    {
        var students =  this.studentRepository.findAll();
        List<Student> result = new ArrayList<Student>();
        for (var student : students) {
            result.add(student);
        }

        return result;
    }

    @GetMapping("/api/student/{id}")
    public Student getAllStudentsInApi(@PathVariable("id") int id)
    {
        var student =  this.studentRepository.findById(id);
       if(student.isPresent())
       {
           return student.get();
       }else{
           throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Student with id "+id+" is not found.");
       }
    }
}
