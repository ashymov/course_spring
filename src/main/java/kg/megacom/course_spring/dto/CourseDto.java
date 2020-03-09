package kg.megacom.course_spring.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CourseDto {
    private Long id;
    private String name;
    private Date startDate;
    private Date endDate;

}
