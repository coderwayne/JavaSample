package com.ofweek.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class User implements Serializable {
    private int userID;
    private String userName;
    private String password;
    private ContactInfo contactInfo;
    private List<ContactInfo> myList;

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", contactInfo=" + contactInfo +
                ", myList=" + myList +
                ", myMap=" + myMap +
                '}';
    }

    public List<ContactInfo> getMyList() {
        return myList;
    }

    public void setMyList(List<ContactInfo> myList) {
        this.myList = myList;
    }

    public Map<String, ContactInfo> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, ContactInfo> myMap) {
        this.myMap = myMap;
    }

    private Map<String, ContactInfo> myMap;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
