package com.test.project.mapper;

import com.test.project.dto.UserDto;
import com.test.project.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-08T17:10:10+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User map(UserDto userDto) {

        User user = new User();

        if ( userDto != null ) {
            user.setFirstName( userDto.getFirstName() );
            user.setSurName( userDto.getSurName() );
            user.setBirthDate( userDto.getBirthDate() );
            user.setLogin( userDto.getLogin() );
            user.setPassword( userDto.getPassword() );
            user.setAddress( userDto.getAddress() );
            user.setAboutMe( userDto.getAboutMe() );
        }

        return user;
    }

    @Override
    public User map(UserDto userDto, User user) {

        User user1 = new User();

        if ( userDto != null ) {
            user1.setFirstName( userDto.getFirstName() );
            user1.setSurName( userDto.getSurName() );
            user1.setBirthDate( userDto.getBirthDate() );
            user1.setLogin( userDto.getLogin() );
            user1.setPassword( userDto.getPassword() );
            user1.setAddress( userDto.getAddress() );
            user1.setAboutMe( userDto.getAboutMe() );
        }
        if ( user != null ) {
            user1.setId( user.getId() );
            user1.setCreatedAt( user.getCreatedAt() );
            user1.setUpdatedAt( user.getUpdatedAt() );
        }

        return user1;
    }

    @Override
    public UserDto map(User user) {

        UserDto userDto = new UserDto();

        if ( user != null ) {
            userDto.setFirstName( user.getFirstName() );
            userDto.setSurName( user.getSurName() );
            userDto.setBirthDate( user.getBirthDate() );
            userDto.setLogin( user.getLogin() );
            userDto.setPassword( user.getPassword() );
            userDto.setAddress( user.getAddress() );
            userDto.setAboutMe( user.getAboutMe() );
        }

        return userDto;
    }
}
