package com.example.RR.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "gen")
    @GenericGenerator(name = "gen", strategy = "increment")
    private int id;
    private String name;
    private String email;
    private String password;
    private String roles;

}
