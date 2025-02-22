package com.rate_my_rejection_backend.rate_my_rejection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "login") // Explicitly define the table name
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Ensure DB generates the ID
    private Long id;

    @JsonProperty("username")
    @Column(nullable = false) // Ensure the column is NOT NULL
    private String username;

    @JsonProperty("password")
    private String password;

    // Default constructor
    public Login() {}

    // Parameterized constructor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters
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
