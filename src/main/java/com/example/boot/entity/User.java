package com.example.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class User implements Serializable {

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer userId;

    @Column
    private String userName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Skill> skills= new LinkedList<>();

}
