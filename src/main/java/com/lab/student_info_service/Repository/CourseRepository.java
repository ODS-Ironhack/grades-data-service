package com.lab.student_info_service.Repository;

import com.lab.student_info_service.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {

}
