package com.dhruv.week7;

public class Student {

    private int studentId;
    private String fname;
    private String lname;
    private String phone;
    private String dob;
    private String street;
    private String city;
    private String number;

    public Student() {
    }

    public Student(int studentId, String fname, String lname, String phone, String dob, String street, String city, String number) {
        this.studentId = studentId;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.dob = dob;
        this.street = street;
        this.city = city;
        this.number = number;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", fname=" + fname + ", lname=" + lname +
                ", phone=" + phone + ", dob=" + dob + ", street=" + street + ", city=" + city + ", number=" + number + "]";
    }
}
