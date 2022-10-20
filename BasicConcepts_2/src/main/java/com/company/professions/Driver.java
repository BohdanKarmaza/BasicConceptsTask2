package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    private String drivingExperience;

    public Driver(String fullName, int age, String sex, String telephoneNumber, String drivingExperience){
        super(fullName, age, sex, telephoneNumber);
        this.drivingExperience = drivingExperience;
    }

    public String getDrivingExperience(){
        return this.drivingExperience;
    }
    public void setDrivingExperience(String drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
