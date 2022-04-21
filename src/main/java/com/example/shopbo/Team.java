package com.example.shopbo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter @Setter
@Entity
public class Team {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "TEAM_NAME")
    private String name;



}
