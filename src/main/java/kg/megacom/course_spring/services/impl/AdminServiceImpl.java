package kg.megacom.course_spring.services.impl;

import kg.megacom.course_spring.dao.*;
import kg.megacom.course_spring.dto.*;
import kg.megacom.course_spring.entities.*;
import kg.megacom.course_spring.mappers.ClassMapper;
import kg.megacom.course_spring.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    @Autowired
    private ClassRoomRepository classRoomRepository;

    @Override
    public UserDto saveUser(UserDto userDto) {

        User user=ClassMapper.INSTANCE.UserDtoToUser(userDto);
        user=userRepository.save(user);
        userDto=ClassMapper.INSTANCE.UserToUserDto(user);
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
        student.setCourse(getCourse());
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
    public List<CourseDto> getFutureCourse() {
        List<Course> courses = courseRepository.findAllByStartDateGreaterThan(new Date());
        return ClassMapper.INSTANCE.coursesToCourseDtos(courses);
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

    @Override
    public Student registerStudent(StudentDto studentDto, CourseDto courseDto) {

        Student student=studentRepository.findById(studentDto.getId()).orElse(null);

        if (student==null){
            throw new RuntimeException("Студента с таким id нет!");
        }
        Course course=courseRepository.findById(courseDto.getId()).orElse(null);
        if (course==null) {
            throw new RuntimeException("Курса с таким id нет!");
        }
        List<Course> courseList=student.getCourse();
        courseList.add(course);
        student.setCourse(courseList);
        student=studentRepository.save(student);
        studentDto=ClassMapper.INSTANCE.StudentToStudentDto(student);
        return student;

    }

    @Override
    public ClassRoomDto saveClassRoom(ClassRoomDto classRoomDto) {
        ClassRoom classRoom=ClassMapper.INSTANCE.ClassRoomDtoToClassRoom(classRoomDto);
        classRoom=classRoomRepository.save(classRoom);
        classRoomDto=ClassMapper.INSTANCE.ClassRoomDtoToClassRoom(classRoom);
        return classRoomDto;
    }

    @Override
    public List<ClassRoom> getClassRomm() {
        return null;
    }
}
