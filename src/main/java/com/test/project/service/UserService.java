package com.test.project.service;

import com.test.project.dto.UserDto;
import com.test.project.model.User;
import org.springframework.http.ResponseEntity;

/**
 * The interface User service.
 */
public interface UserService {

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     */
    ResponseEntity<?> getUser(Long id);

    /**
     * Gets all users.
     *
     * @return the all users
     */
    ResponseEntity<?> getAllUsers();

    /**
     * Create user.
     *
     * @param userDto the user dto
     * @return the response entity
     */
    User create(UserDto userDto);

    /**
     * Update user.
     *
     * @param userDto the user dto
     */
    void update(UserDto userDto, Long id);

    /**
     * Delete user.
     *
     * @param id the id
     * @return the response entity
     */
    ResponseEntity<?> delete(Long id);
}
