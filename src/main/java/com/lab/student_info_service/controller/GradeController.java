package com.lab.student_info_service.controller;

import com.lab.student_info_service.DTO.CourseGradeDTO;
import com.lab.student_info_service.model.Grade;
import com.lab.student_info_service.service.GradeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/grade")
public class GradeController {

    GradeService gradeService;

    @GetMapping()
    public List<Grade> getAllGrades(){
        return gradeService.getAllGrades();
    }

    @GetMapping("/{courseCode}")
    public CourseGradeDTO getCourseGradesByCourseCode(@PathVariable String courseCode){
        return gradeService.getCourseGradesByCourseCode(courseCode);
    }
}
