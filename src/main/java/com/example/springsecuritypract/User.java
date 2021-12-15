package com.example.springsecuritypract;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ToString
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String role;
}
