package com.example.boot.service;

import com.example.boot.converter.UserConverter;
import com.example.boot.dto.UserDTO;
import com.example.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO getUserById(Integer userId) {
        return UserConverter.entityToDto(userRepository.getOne(userId));
    }

    @Override
    public void saveUser(UserDTO userDto) {
        userRepository.save(UserConverter.dtoToEntity(userDto));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
    }
}
