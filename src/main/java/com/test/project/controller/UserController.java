package com.test.project.controller;

import com.test.project.dto.UserDto;
import com.test.project.model.User;
import com.test.project.service.UserService;
import com.test.project.util.ApiPathConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiPathConstants.API + ApiPathConstants.USER)
@RequiredArgsConstructor
@Api(tags = "Controller for operation with users")
public class UserController {

    private final UserService userService;

    @GetMapping(path = ApiPathConstants.BY_ID)
    @ApiOperation("Gets user by id")
    public ResponseEntity<?> user(@PathVariable("id")Long id) {
        return userService.getUser(id);
    }

    @GetMapping
    @ApiOperation("Gets all users")
    public ResponseEntity<?> allUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping
    @ApiOperation("Create user")
    public ResponseEntity<User> create(@Validated @RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.create(userDto));
    }

    @PutMapping(path = ApiPathConstants.BY_ID)
    @ApiOperation("Update user")
    public void update(@PathVariable Long id, @Validated @RequestBody UserDto userDto) {
        userService.update(userDto, id);
    }

    @DeleteMapping
    @ApiOperation("Delete user")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

}
