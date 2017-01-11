package com.me.sparta.login.authentication;

public class AuthenticationRespone {

    private String token;
    private String userId;
    private String username;

    public AuthenticationRespone() {
    }

    public AuthenticationRespone(String token, String userId, String username) {
        this.token = token;
        this.userId = userId;
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "AuthenticationRespone{" +
                "token='" + token + '\'' +
                ", userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}


