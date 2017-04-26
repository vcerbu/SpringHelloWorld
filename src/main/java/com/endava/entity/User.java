package com.endava.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vcerbu on 4/26/2017.
 */
@Entity
@Table(name = "User1")
public class User implements Serializable{

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
