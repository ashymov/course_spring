package kg.megacom.course_spring.services.impl;

import kg.megacom.course_spring.dao.*;
import kg.megacom.course_spring.dto.*;
import kg.megacom.course_spring.entities.*;
import kg.megacom.course_spring.mappers.ClassMapper;
import kg.megacom.course_spring.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public UserDto saveUser(UserDto userDto) {

        User user=ClassMapper.INSTANCE.UserDtoToUser(userDto);
        user=userRepository.save(user);
        userDto=ClassMapper.INSTANCE.UserToUserDto(user);
        userDto.setRole(user.getRole());
        return userDto;
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student =ClassMapper.INSTANCE.SrudentDtoToStudent(studentDto);
        student=studentRepository.save(student);
        studentDto=ClassMapper.INSTANCE.StudentToStudentDto(student);
        return studentDto;
    }

    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @Override
    public CourseDto saveCourse(CourseDto courseDto) {
        Course course=ClassMapper.INSTANCE.CourseDtoToCourse(courseDto);
        course=courseRepository.save(course);
        courseDto=ClassMapper.INSTANCE.CourseToCourseDto(course);
        return courseDto;

    }

    @Override
    public List<Course> getCourse() {
        return courseRepository.findAll();
    }

    @Override
    public RoleDto saveRole(RoleDto roleDto) {
        Role role =ClassMapper.INSTANCE.RoleDtoToRole(roleDto);
        role=roleRepository.save(role);
        roleDto=ClassMapper.INSTANCE.RoleToRoleDto(role);
        return roleDto;
    }

    @Override
    public List<Role> getRole() {
        return roleRepository.findAll();
    }

    @Override
    public TeacherDto saveTeacher(TeacherDto teacherDto) {
        Teacher teacher=ClassMapper.INSTANCE.TeacherDtoToTeacher(teacherDto);
        teacher=teacherRepository.save(teacher);
        teacherDto=ClassMapper.INSTANCE.TeacherToTeacherDto(teacher);
        return teacherDto;
    }

    @Override
    public List<Teacher> getTeacher() {
        return teacherRepository.findAll();
    }
}
