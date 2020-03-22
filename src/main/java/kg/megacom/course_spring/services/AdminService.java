package kg.megacom.course_spring.services;

import kg.megacom.course_spring.dto.*;
import kg.megacom.course_spring.entities.*;

import java.util.List;

public interface AdminService {
    UserDto saveUser(UserDto userDto);
    List<UserDto> getUser();

    StudentDto saveStudent(StudentDto studentDto);
    List<StudentDto> getStudent();

    CourseDto saveCourse(CourseDto courseDto);
    List<CourseDto> getCourse();
    List<CourseDto> getFutureCourse();

    RoleDto saveRole(RoleDto roleDto);
    List<RoleDto> getRole();

    TeacherDto saveTeacher(TeacherDto teacherDto);
    List<TeacherDto> getTeacher();


    StudentDto registerStudent(StudentDto studentDto,CourseDto courseDto);

    ClassRoomDto saveClassRoom(ClassRoomDto classRoomDto);
    List<ClassRoomDto> getClassRoom();

    CourseDaysDto saveCourseDays(CourseDaysDto courseDaysDto);
    List<CourseDaysDto> getCourseDays();

    DaysDto saveDays(DaysDto daysDto);
    List<DaysDto> getDays();
}
