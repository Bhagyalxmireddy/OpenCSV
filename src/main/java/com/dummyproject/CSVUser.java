package com.dummyproject;

import com.opencsv.bean.CsvBindByName;
public class CSVUser {

    @CsvBindByName
    private String name;

    @CsvBindByName(column = "email")
    private String email;

    @CsvBindByName(column = "PhoneNo")
    private long PhoneNo;

    @CsvBindByName
    private String country;

    public CSVUser(String name, String email, String PhoneNo, String country) {
    }

    @Override
    public String toString(){
        return "CSVUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + PhoneNo + '\'' +
                ", country='" + country + '\'' +
                '}';
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

    public long getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.PhoneNo = phoneNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
