package com.example.solarwatch.dto.user;

public class CreateUserRequest {
    private String username;
    private String password;

    public CreateUserRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
