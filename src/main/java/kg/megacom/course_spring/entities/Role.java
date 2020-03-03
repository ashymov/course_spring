package kg.megacom.course_spring.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.AbstractCollection;
@Entity
@Data
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;



}
