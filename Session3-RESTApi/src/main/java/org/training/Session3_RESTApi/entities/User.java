package org.training.Session3_RESTApi.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String username;

    @Column(nullable = false, unique = true)
    String email;

//    String address;


}
