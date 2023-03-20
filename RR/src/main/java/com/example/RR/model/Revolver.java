package com.example.RR.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "Revolvers")
public class Revolver{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "gen1")
    @GenericGenerator(name = "gen1", strategy = "increment")
    private int id;
    private String model;
    private int price;

    //fetch type lazy pobieramy dane dopiero wtedy gdy ich potrzebujemy
    @JsonIgnore
    @OneToMany(mappedBy = "revolver",fetch = FetchType.LAZY, cascade = CascadeType.ALL) //domyslny jest lazy no ale :) for my assurance
    private List<Bullet> bullet;


}
