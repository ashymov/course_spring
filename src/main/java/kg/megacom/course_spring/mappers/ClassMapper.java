package kg.megacom.course_spring.mappers;

import kg.megacom.course_spring.dto.UserDto;
import kg.megacom.course_spring.entities.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper

public interface ClassMapper {

    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);


    User UserDtoToUser(UserDto userDto);
    @InheritInverseConfiguration
    UserDto UserToUserDto(User user);

}
