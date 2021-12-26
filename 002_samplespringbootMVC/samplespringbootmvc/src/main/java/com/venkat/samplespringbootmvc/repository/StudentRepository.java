package com.venkat.samplespringbootmvc.repository;

import com.venkat.samplespringbootmvc.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
