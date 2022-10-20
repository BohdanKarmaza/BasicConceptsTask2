package com.company.entities;

public class Person {
    private String fullName;
    private int age;
    private String sex;
    private String telephoneNumber;
    public Person(String fullName, int age, String sex, String telephoneNumber) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.telephoneNumber = telephoneNumber;
    }

    public String getFullName(){
        return this.fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex(){
        return this.sex;
    }
    public void setSex(String Sex) {
        this.sex = sex;
    }
    public String getTelephoneNumber(){
        return this.telephoneNumber;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
