package com.springmvc.EmployeeLogin;

public class Login {

    private String email;
    private String username;
    private String pass;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    @Override
    public String toString() {
        return "Login{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
