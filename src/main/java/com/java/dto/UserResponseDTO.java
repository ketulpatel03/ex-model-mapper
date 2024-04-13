package com.java.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
public class UserResponseDTO {

    private String firstName;
    private String lastName;
    @JsonIgnore
    private String email;


}
