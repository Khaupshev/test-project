package com.test.project.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * The type User dto.
 */
@ApiModel("The user DTO")
@Getter
@Setter
public class UserDto {

    @ApiModelProperty("First name")
    private String firstName;

    @ApiModelProperty("Surname")
    private String surName;

    @ApiModelProperty("Date of birth")
    private LocalDate birthDate;

    @ApiModelProperty("Login")
    private String login;

    @ApiModelProperty("Password")
    private String password;

    @ApiModelProperty("Address")
    private String address;

    @ApiModelProperty("Column about yourself")
    private String aboutMe;

}
