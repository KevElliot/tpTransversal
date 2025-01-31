package com.example.parisport.Modele;

public class User {
    private String _id;
    private String name;
    private String email;
    private String password;
    private String role;
    private int jetons;
    private String image;

    public User(String id, String name, String email, String password, String role, int jetons, String image) {
        this._id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.jetons = jetons;
        this.image = image;
    }

    public User(String name, String email, String password, String role, int jetons) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.jetons = jetons;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getJetons() {
        return jetons;
    }

    public void setJetons(int jetons) {
        this.jetons = jetons;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
