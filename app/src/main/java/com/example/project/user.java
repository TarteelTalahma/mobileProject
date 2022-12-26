package com.example.project;

import java.util.ArrayList;

public class user {
    private String username;
    private String email;
    private String password;
    public static ArrayList<user> registeredUser  = new ArrayList<>();
    public user(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() { return password;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
