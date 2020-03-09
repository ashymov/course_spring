package kg.megacom.course_spring.dto;

import kg.megacom.course_spring.entities.Role;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String password;
    private String login;

    private Role role;



}
