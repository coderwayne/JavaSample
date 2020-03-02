package com.ofweek;

public class UserServiceImpl implements UserService {
    private String userName;
    private int age;
    private ContactInfo contactInfo;
    private String address;
    private double PI;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", contactInfo=" + contactInfo +
                ", address='" + address + '\'' +
                ", PI=" + PI +
                '}';
    }
}
