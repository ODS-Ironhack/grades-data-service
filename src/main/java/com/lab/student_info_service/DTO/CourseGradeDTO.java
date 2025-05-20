package com.lab.student_info_service.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseGradeDTO {
    private String courseCode;
    private String courseName;
    private List<GradesDTO> grades;
}
