package com.example.shopbo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Member {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "USER_NAME")
    private String userName;

    //연관관계맵핑
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

}
