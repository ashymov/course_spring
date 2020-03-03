package kg.megacom.course_spring.entities;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.lang.annotation.Target;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;
    private String login;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


}
