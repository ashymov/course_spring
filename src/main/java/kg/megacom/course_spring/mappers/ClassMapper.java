package kg.megacom.course_spring.mappers;

import kg.megacom.course_spring.dto.*;
import kg.megacom.course_spring.entities.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper

public interface ClassMapper {

    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);


    User UserDtoToUser(UserDto userDto);
    @InheritInverseConfiguration
    UserDto UserToUserDto(User user);
    List<UserDto> UsersToUserDtos(List<User> users);

    Role RoleDtoToRole(RoleDto roleDto);
    @InheritInverseConfiguration
    RoleDto RoleToRoleDto(Role role);
    List<RoleDto> RolesToRoleDtos(List<Role> roles);

    Student StudentDtoToStudent(StudentDto studentDto);
    @InheritInverseConfiguration
    StudentDto StudentToStudentDto(Student student);
    List<StudentDto> StudentsToStudentDtos(List<Student> students);

    Course CourseDtoToCourse(CourseDto courseDto);
    @InheritInverseConfiguration
    CourseDto CourseToCourseDto(Course course);
    List<CourseDto> CoursesToCourseDtos(List<Course> courses);


    Teacher TeacherDtoToTeacher(TeacherDto teacherDto);
    @InheritInverseConfiguration
    TeacherDto TeacherToTeacherDto(Teacher teacher);
    List<TeacherDto> TeachersToTeachersDtos(List<Teacher> teachers);

    Days DaysDtoToDays(DaysDto daysDto);
    DaysDto DaysToDaysDto(Days days);
    List<DaysDto> DaysToDayDtos(List<Days> days);

    ClassRoom ClassRoomDtoToClassRoom(ClassRoomDto classRoomDto);
    @InheritInverseConfiguration
    ClassRoomDto ClassRoomToClassRoomDto(ClassRoom classRoom);
    List<ClassRoomDto> ClassRoomsToClassRoomDtos(List<ClassRoom> classRooms);

    CourseDays CourseDaysDtoToCourseDays(CourseDaysDto courseDaysDto);
    @InheritInverseConfiguration
    CourseDaysDto CourseDaysToCourseDaysDto(CourseDays courseDays);
    List<CourseDaysDto> CourseDaysToCourseDaysDtos(List<CourseDays> courseDays);
}
