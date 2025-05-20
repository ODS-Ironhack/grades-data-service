package com.lab.student_info_service.service;

import com.lab.student_info_service.DTO.CourseGradeDTO;
import com.lab.student_info_service.Repository.CourseRepository;
import com.lab.student_info_service.model.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService {


    private final CourseRepository courseRepository;

    public Optional<Course> getCourseByCourseCode(String courseCode){
        return courseRepository.findById(courseCode);
    }


}
