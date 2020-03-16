package kg.megacom.course_spring.services;

import kg.megacom.course_spring.dto.*;
import kg.megacom.course_spring.entities.*;

import java.util.List;

public interface AdminService {
    UserDto saveUser(UserDto userDto);
    List<User> getUser();

    StudentDto saveStudent(StudentDto studentDto);
    List<Student> getStudent();

    CourseDto saveCourse(CourseDto courseDto);
    List<Course> getCourse();
    List<CourseDto> getFutureCourse();

    RoleDto saveRole(RoleDto roleDto);
    List<Role> getRole();

    TeacherDto saveTeacher(TeacherDto teacherDto);
    List<Teacher> getTeacher();


    Student registerStudent(StudentDto studentDto,CourseDto courseDto);

    ClassRoomDto saveClassRoom(ClassRoomDto classRoomDto);
    List<ClassRoom> getClassRomm();
}
