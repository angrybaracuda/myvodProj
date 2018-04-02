/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.myvodws;

/**
 *
 * @author kunsi
 */

 


public class User {
    private int  uid;
    private String userName;
    private String name;
    private String email;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String mobile;
    private String interests;
    private String address;
    private String accntType;

    public User() {
    }

    public User(int uid, String userName, String name, String email, String mobile, String interests, String address, String accntType, String dob) {
        this.uid = uid;
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.interests = interests;
        this.address = address;
        this.accntType = accntType;
        this.dob = dob;
    }
    private String dob;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccntType() {
        return accntType;
    }

    public void setAccntType(String accntType) {
        this.accntType = accntType;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
}
