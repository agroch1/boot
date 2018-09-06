package com.example.boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class UserDTO {

    private Integer userId;

    private String userName;

    List<SkillDto> skillDtos= new ArrayList<>();
}
