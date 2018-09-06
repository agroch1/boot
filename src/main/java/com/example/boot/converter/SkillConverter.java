package com.example.boot.converter;

import com.example.boot.dto.SkillDto;
import com.example.boot.entity.Skill;

public class SkillConverter {

    public static SkillDto entityToDto(Skill skill) {
        return new SkillDto(skill.getSkillId(), skill.getSkillName());
    }

    public static Skill dtoToEntity(SkillDto skillDto) {
        return new Skill(skillDto.getSkillId(), skillDto.getSkillName(), null);
    }
}
