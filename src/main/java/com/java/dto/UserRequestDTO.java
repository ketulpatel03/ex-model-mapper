package com.java.dto;

import lombok.Data;

@Data
public class UserRequestDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String nationality;
    private String address;
    private int age;
    private String gender;

}
