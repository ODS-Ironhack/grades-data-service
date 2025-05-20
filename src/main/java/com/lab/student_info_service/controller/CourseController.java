package com.lab.student_info_service.controller;

import com.lab.student_info_service.DTO.CourseGradeDTO;
import com.lab.student_info_service.model.Course;
import com.lab.student_info_service.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/course")
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/{courseCode}")
    public Optional<Course> getCourseById(@PathVariable String courseCode){
        return courseService.getCourseByCourseCode(courseCode);
    }



}
