package kg.megacom.course_spring.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CourseDaysDto {
    private Long id;
    private Date startsDate;
    private Date endDate;
}
