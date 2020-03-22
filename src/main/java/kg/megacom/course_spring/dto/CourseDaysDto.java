package kg.megacom.course_spring.dto;

import lombok.Data;

import java.time.LocalTime;
import java.util.Date;

@Data
public class CourseDaysDto {
    private Long id;
    private Long dayId;
    private Long courseId;
    private Long classroomId;
    private LocalTime beginTime;
    private LocalTime endTime;

}
