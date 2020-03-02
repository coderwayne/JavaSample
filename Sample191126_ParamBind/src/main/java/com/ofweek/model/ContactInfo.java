package com.ofweek.model;

import java.io.Serializable;

public class ContactInfo implements Serializable {
    private String mobilePhone;
    private String address;

    @Override
    public String toString() {
        return "ContactInfo{" +
                "mobilePhone='" + mobilePhone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
