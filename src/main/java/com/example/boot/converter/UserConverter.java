package com.example.boot.converter;

import com.example.boot.dto.UserDTO;
import com.example.boot.entity.User;

import java.util.stream.Collectors;

public class UserConverter {

    public static User dtoToEntity(UserDTO userDto) {
        return new User(userDto.getUserId(), userDto.getUserName(),
            userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
    }
    public static UserDTO entityToDto(User user) {
        return new UserDTO(user.getUserId(), user.getUserName(), user.getSkills()
                .stream()
                .map(SkillConverter::entityToDto)
                .collect(Collectors.toList()));
    }
}
