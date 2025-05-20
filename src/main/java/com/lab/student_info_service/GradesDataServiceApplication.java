package com.lab.student_info_service;

import com.lab.student_info_service.Repository.CourseRepository;
import com.lab.student_info_service.Repository.GradeRepository;
import com.lab.student_info_service.model.Grade;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GradesDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradesDataServiceApplication.class, args);
	}

/*
		@Bean
		CommandLineRunner initData(GradeRepository gradeRepository, CourseRepository courseRepository) {
		return args -> {
			Grade s1 = new Grade();
			s1.setStudentId(2L);
			s1.setGrade(3);

			var course = courseRepository.findById("102B");
			s1.setCourse(course.get());

			gradeRepository.save(s1);

			};
		}*/
}
