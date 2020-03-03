package kg.megacom.course_spring.services;

import kg.megacom.course_spring.dto.UserDto;
import kg.megacom.course_spring.entities.Student;
import kg.megacom.course_spring.entities.User;

import java.util.List;

public interface AdminService {
    UserDto saveUser(UserDto userDto);
    List<User> getUser();

    Student saveStudent(Student student);
    List<Student> getStudent();
}
