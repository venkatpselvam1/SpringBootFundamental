package com.venkat.samplespringboot.repository;

import com.venkat.samplespringboot.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
