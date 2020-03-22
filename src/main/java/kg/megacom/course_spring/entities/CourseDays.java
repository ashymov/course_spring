package kg.megacom.course_spring.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Data
@Entity
@Table(name = "course_days")
public class CourseDays {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_days_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "day_day_id")
    private Days days;
    @ManyToOne
    @JoinColumn(name = "course_course_id")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "classroom_classroom_id")
    private ClassRoom classRoom;
    private LocalTime beginTime;
    private LocalTime endTime;


}
