package kg.megacom.course_spring.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "days")
public class Days {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean isActive;
}
