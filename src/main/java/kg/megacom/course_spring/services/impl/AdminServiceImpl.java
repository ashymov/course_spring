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
    @Autowired
    private DaysRepository daysRepository;
    @Autowired
    private CourseDaysRepository courseDaysRepository;

    @Override
    public UserDto saveUser(UserDto userDto) {

        User user = ClassMapper.INSTANCE.UserDtoToUser(userDto);
        user = userRepository.save(user);
        return ClassMapper.INSTANCE.UserToUserDto(user);
    }

    @Override
    public List<UserDto> getUser() {
        List<User> users=userRepository.findAll();
        return ClassMapper.INSTANCE.UsersToUserDtos(users);
    }

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = ClassMapper.INSTANCE.StudentDtoToStudent(studentDto);
        student = studentRepository.save(student);
        return ClassMapper.INSTANCE.StudentToStudentDto(student);
    }

    @Override
    public List<StudentDto> getStudent() {
        List<Student> students=studentRepository.findAll();
        return ClassMapper.INSTANCE.StudentsToStudentDtos(students);
    }

    @Override
    public CourseDto saveCourse(CourseDto courseDto) {
        Course course = ClassMapper.INSTANCE.CourseDtoToCourse(courseDto);
        course = courseRepository.save(course);
        courseDto = ClassMapper.INSTANCE.CourseToCourseDto(course);
        return courseDto;

    }

    @Override
    public List<CourseDto> getCourse() {
        List<Course> courseList=courseRepository.findAll();
        return ClassMapper.INSTANCE.CoursesToCourseDtos(courseList);
    }

    @Override
    public List<CourseDto> getFutureCourse() {
        List<Course> courses = courseRepository.findAllByStartDateGreaterThan(new Date());
        return ClassMapper.INSTANCE.CoursesToCourseDtos(courses);
    }

    @Override
    public RoleDto saveRole(RoleDto roleDto) {
        Role role = ClassMapper.INSTANCE.RoleDtoToRole(roleDto);
        role = roleRepository.save(role);
        roleDto = ClassMapper.INSTANCE.RoleToRoleDto(role);
        return roleDto;
    }

    @Override
    public List<RoleDto> getRole() {
        List<Role> roles=roleRepository.findAll();
        return ClassMapper.INSTANCE.RolesToRoleDtos(roles);
    }

    @Override
    public TeacherDto saveTeacher(TeacherDto teacherDto) {
        Teacher teacher = ClassMapper.INSTANCE.TeacherDtoToTeacher(teacherDto);
        teacher = teacherRepository.save(teacher);
        teacherDto = ClassMapper.INSTANCE.TeacherToTeacherDto(teacher);
        return teacherDto;
    }

    @Override
    public List<TeacherDto> getTeacher() {
        List<Teacher> teachers=teacherRepository.findAll();
        return ClassMapper.INSTANCE.TeachersToTeachersDtos(teachers);
    }

    @Override
    public StudentDto registerStudent(StudentDto studentDto, CourseDto courseDto) {

        Student student = studentRepository.findById(studentDto.getId()).orElse(null);

        if (student == null) {
            throw new RuntimeException("Студента с таким id нет!");
        }
        Course course = courseRepository.findById(courseDto.getId()).orElse(null);
        if (course == null) {
            throw new RuntimeException("Курса с таким id нет!");
        }
        List<Course> courseList = student.getCourse();
        courseList.add(course);
        student.setCourse(courseList);
        student = studentRepository.save(student);
        return ClassMapper.INSTANCE.StudentToStudentDto(student);

    }

    @Override
    public ClassRoomDto saveClassRoom(ClassRoomDto classRoomDto) {
        ClassRoom classRoom = ClassMapper.INSTANCE.ClassRoomDtoToClassRoom(classRoomDto);
        classRoom = classRoomRepository.save(classRoom);
        return ClassMapper.INSTANCE.ClassRoomToClassRoomDto(classRoom);
    }

    @Override
    public List<ClassRoomDto> getClassRoom() {
        List<ClassRoom> classRooms=classRoomRepository.findAll();
        return ClassMapper.INSTANCE.ClassRoomsToClassRoomDtos(classRooms);
    }

    @Override
    public CourseDaysDto saveCourseDays(CourseDaysDto courseDaysDto) {
        Course course = courseRepository.findById(courseDaysDto.getCourseId()).orElse(null);
        if (course == null) {
            throw new RuntimeException("Курса не существует");
        }

        ClassRoom classRoom = classRoomRepository.findById(courseDaysDto.getClassroomId()).orElse(null);
        if (classRoom == null) {
            throw new RuntimeException("Кабинета не существует");
        }

        Days days = daysRepository.findById(courseDaysDto.getDayId()).orElse(null);
        if (days == null) {
            throw new RuntimeException("В этот день нет занятий");
        }
        CourseDays courseDays=new CourseDays();
        courseDays.setCourse(course);
        courseDays.setClassRoom(classRoom);
        courseDays.setDays(days);
        courseDays.setBeginTime(courseDaysDto.getBeginTime());
        courseDays.setEndTime(courseDaysDto.getEndTime());

        courseDays=courseDaysRepository.save(courseDays);

        return ClassMapper.INSTANCE.CourseDaysToCourseDaysDto(courseDays);
    }


    @Override
    public List<CourseDaysDto> getCourseDays() {
        List<CourseDays> courseDays=courseDaysRepository.findAll();
        return ClassMapper.INSTANCE.CourseDaysToCourseDaysDtos(courseDays);
    }

    @Override
    public DaysDto saveDays(DaysDto daysDto) {
        Days days=ClassMapper.INSTANCE.DaysDtoToDays(daysDto);
        days=daysRepository.save(days);
        return ClassMapper.INSTANCE.DaysToDaysDto(days);
    }

    @Override
    public List<DaysDto> getDays() {
        List<Days> days=daysRepository.findAll();
        return ClassMapper.INSTANCE.DaysToDayDtos(days);
    }
}
