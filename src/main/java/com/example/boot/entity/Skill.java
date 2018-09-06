package com.example.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class Skill implements Serializable {

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer skillId;

    @Column
    private String skillName;

    @ManyToOne
    private User user;
}
