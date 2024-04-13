package com.java.mapper;

import com.java.dto.UserRequestDTO;
import com.java.dto.UserResponseDTO;
import com.java.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    @Autowired
    private ModelMapper modelMapper;

    public UserResponseDTO convertUserToUserResponseDTO(User user){
        return modelMapper.map(user, UserResponseDTO.class);
    }

    public User convertUserRequestDTOToUser(UserRequestDTO userRequestDTO){
        return modelMapper.map(userRequestDTO, User.class);
    }

}
