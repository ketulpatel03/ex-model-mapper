package com.java.service;

import com.java.dto.UserRequestDTO;
import com.java.dto.UserResponseDTO;
import com.java.entity.User;
import com.java.mapper.UserConverter;
import com.java.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserRepository userRepository;

    public UserResponseDTO saveUser(UserRequestDTO userRequestDTO) {
        User user = userConverter.convertUserRequestDTOToUser(userRequestDTO);
        User savedUser = userRepository.save(user);
        return userConverter.convertUserToUserResponseDTO(savedUser);
    }

    public UserResponseDTO getUser(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
        return userConverter.convertUserToUserResponseDTO(user);
    }

}
