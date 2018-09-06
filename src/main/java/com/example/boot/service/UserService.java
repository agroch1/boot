package com.example.boot.service;

import com.example.boot.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO getUserById(Integer userId);

    void saveUser(UserDTO userDto);

    List<UserDTO> getAllUsers();
}
