package com.test.project.mapper;

import com.test.project.config.SpringMapperConfig;
import com.test.project.dto.UserDto;
import com.test.project.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * The interface User mapper.
 */
@Mapper(config = SpringMapperConfig.class)
public interface UserMapper {

    /**
     * Map user.
     *
     * @param userDto
     *         the user dto
     *
     * @return the user
     */
    @Mapping(target = "id", ignore = true)
    User map(UserDto userDto);

    /**
     * Map user.
     *
     * @param userDto
     *         the user dto
     * @param user
     *         the user
     *
     * @return the user
     */
    @Mapping(target = "id", source = "user.id")
    @Mapping(target = "firstName", source = "userDto.firstName")
    @Mapping(target = "surName", source = "userDto.surName")
    @Mapping(target = "birthDate", source = "userDto.birthDate")
    @Mapping(target = "login", source = "userDto.login")
    @Mapping(target = "password", source = "userDto.password")
    @Mapping(target = "address", source = "userDto.address")
    @Mapping(target = "aboutMe", source = "userDto.aboutMe")
    User map(UserDto userDto, User user);

    /**
     * Map user dto.
     *
     * @param user
     *         the user
     *
     * @return the user dto
     */
    UserDto map(User user);

}
