package kg.megacom.course_spring.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
