package com.lab.student_info_service.service;

import com.lab.student_info_service.DTO.CourseGradeDTO;
import com.lab.student_info_service.DTO.GradesDTO;
import com.lab.student_info_service.Repository.CourseRepository;
import com.lab.student_info_service.Repository.GradeRepository;
import com.lab.student_info_service.model.Course;
import com.lab.student_info_service.model.Grade;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class GradeService {

    private final GradeRepository gradeRepository;
    private final CourseRepository courseRepository;


    public List<Grade> getAllGrades(){
        return gradeRepository.findAll();
    }


    public CourseGradeDTO getCourseGradesByCourseCode(String courseCode){
        var courseGradeDTO = new CourseGradeDTO();

        List<Grade> grades =  gradeRepository.findByCourse_CourseCode(courseCode);
        Course course = courseRepository.findById(courseCode)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Course not found"));

        List<GradesDTO> gradesDTOs = grades.stream()
                .map(g -> new GradesDTO(g.getGrade(), g.getStudentId()))
                .toList();

        courseGradeDTO.setCourseCode(courseCode);
        courseGradeDTO.setCourseName(course.getCourseName());
        courseGradeDTO.setGrades(gradesDTOs);

        return courseGradeDTO;
    }
}

