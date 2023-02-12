package com.shop.pojo;

import java.util.Date;

public class User {
    private String user_id;
    private String username;
    private String password;
    private Date birth;
    private String address;
    private String phone;
    private String email;
    private Date creationTime;
    private int power;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birth=" + birth +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", creationTime=" + creationTime +
                ", power=" + power +
                '}';
    }

    public User(String user_id, String username, String password, Date birth, String address, String phone, String email, Date creationTime, int power) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.creationTime = creationTime;
        this.power = power;
    }

    public User() {
    }
}
