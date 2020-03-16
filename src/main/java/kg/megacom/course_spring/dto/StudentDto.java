package kg.megacom.course_spring.dto;

import kg.megacom.course_spring.entities.Course;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {
    private Long id;
    private String name;
    private List<Course> course;

}
