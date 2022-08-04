package com.ammar.ibltest.entity;

import javax.persistence.*;

@Entity
@Table(name = "IBLUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique=true, nullable=false, precision=10,name="id")
    private Integer id;
    private String firstName;
    private String secondName;
    private String email;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
