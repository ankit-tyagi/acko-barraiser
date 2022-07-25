package com.acko.newsLetter.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "usertable")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mail")
    private String email;
}
