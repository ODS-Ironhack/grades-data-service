package com.lab.student_info_service.Repository;

import com.lab.student_info_service.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findByCourse_CourseCode(String courseCode);
}
