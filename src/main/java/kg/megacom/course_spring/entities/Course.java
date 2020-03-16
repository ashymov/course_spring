package kg.megacom.course_spring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    @JsonIgnore
    private Teacher teacher;


}
