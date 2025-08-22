package com.yash.eventmanagementsystem.domain;

import java.util.Objects;

public class User {
    private int user_id;
    private String name;
    private String email;
    private String password;
    private String department;
    private Role role; //user, admin, organizer
    private int points;

    public enum Role {
        USER,
        ADMIN,
        ORGANIZER
    }

    public User() {
    }

    public User(int user_id, String name, String email, String password, String department, Role role, int points) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.department = department;
        this.role = role;
        this.points = points;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return user_id == user.user_id && points == user.points && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(department, user.department) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, name, email, password, department, role, points);
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", role=" + role +
                ", points=" + points +
                '}';
    }
}
