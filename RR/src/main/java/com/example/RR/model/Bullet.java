package com.example.RR.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Getter
@Setter
@Table(name = "Bullets")
public class Bullet{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "gen1")
    @GenericGenerator(name = "gen1", strategy = "increment")
    private int id;
    @Column(name = "revolver_id", updatable = false, insertable = false) // kiedy mapping jest podwojony
    private int revolver_classID;

    @JsonIgnore
    @ManyToOne
    private Revolver revolver;

}
