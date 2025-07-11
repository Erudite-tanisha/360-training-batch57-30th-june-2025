package com.example.Relational.Mapping.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class User {


    @Id
    private int id;

    private String name;

//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
//    private Profile profile;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    List<Post> postList;


}
