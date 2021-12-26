package com.venkat.samplespringbootmvc;

import com.venkat.samplespringbootmvc.entity.Student;
import com.venkat.samplespringbootmvc.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SamplespringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplespringbootApplication.class, args);
		System.out.println("venkat");

	}

	@Bean
	public CommandLineRunner saveSomeValues(StudentRepository studentRepository)
	{
		return args ->
		{
			for(int i = 0; i < 4; i++)
			{
				var s = new Student();
				s.setName("venkat"+i);
				studentRepository.save(s);
			}
		};
	}
}
