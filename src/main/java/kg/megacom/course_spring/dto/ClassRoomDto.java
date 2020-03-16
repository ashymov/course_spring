package kg.megacom.course_spring.dto;

import kg.megacom.course_spring.entities.CourseDays;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import java.util.List;

@Data
public class ClassRoomDto {
    private Long id;
    private String name;


    private List<CourseDays> courseDays;
}
