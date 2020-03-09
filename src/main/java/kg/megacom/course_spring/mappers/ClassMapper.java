package kg.megacom.course_spring.mappers;

import kg.megacom.course_spring.dto.*;
import kg.megacom.course_spring.entities.*;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface ClassMapper {

    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);


    User UserDtoToUser(UserDto userDto);
    @InheritInverseConfiguration
    UserDto UserToUserDto(User user);

    Role RoleDtoToRole(RoleDto roleDto);
    @InheritInverseConfiguration
    RoleDto RoleToRoleDto(Role role);

    Student SrudentDtoToStudent(StudentDto studentDto);
    @InheritInverseConfiguration
    StudentDto StudentToStudentDto(Student student);

    Course CourseDtoToCourse(CourseDto courseDto);
    @InheritInverseConfiguration
    CourseDto CourseToCourseDto(Course course);

    Teacher TeacherDtoToTeacher(TeacherDto teacherDto);
    @InheritInverseConfiguration
    TeacherDto TeacherToTeacherDto(Teacher teacher);
}
