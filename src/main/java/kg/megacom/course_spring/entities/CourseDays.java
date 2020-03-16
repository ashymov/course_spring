package kg.megacom.course_spring.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "course_days")
public class CourseDays {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date startsDate;
    private Date endDate;



}
