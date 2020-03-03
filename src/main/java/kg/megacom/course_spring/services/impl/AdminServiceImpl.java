package kg.megacom.course_spring.services.impl;

import kg.megacom.course_spring.dao.UserRepository;
import kg.megacom.course_spring.dto.UserDto;
import kg.megacom.course_spring.entities.Student;
import kg.megacom.course_spring.entities.User;
import kg.megacom.course_spring.mappers.ClassMapper;
import kg.megacom.course_spring.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = ClassMapper.INSTANCE.UserDtoToUser(userDto);
        return userDto;
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> getStudent() {
        return null;
    }
}
