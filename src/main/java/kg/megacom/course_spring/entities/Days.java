package kg.megacom.course_spring.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "days")
public class Days {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "day_id")
    private Long id;
    private String name;
    private boolean isActive;
}
