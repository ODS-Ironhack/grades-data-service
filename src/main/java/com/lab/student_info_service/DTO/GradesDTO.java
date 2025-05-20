package com.lab.student_info_service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GradesDTO {
    private double grade;
    private Long studentId;
}
