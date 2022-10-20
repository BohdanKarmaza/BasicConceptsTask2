package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public abstract class Car {
    private String carBrand;
    private String carClass;
    private Driver driver;
    private Engine engine;

    public Car(String carBrand, String carClass, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
    }

    public String getCarBrand(){
        return this.carBrand;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarClass(){
        return this.carClass;
    }
    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Driver driver(){
        return this.driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine engine(){
        return this.engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        System.out.println("Let's go!");
    }
    public void stop(){
        System.out.println("Stopping!");
    }
    public void turnRight(){
        System.out.println("Turning right!");
    }
    public void turnLeft(){
        System.out.println("Turning left!");
    }

    @Override
    public String toString(){
        return "Car {carBrand = " + getCarBrand() + ";" +
                "carClass = " + getCarClass() + ";" +
                "driver.fullName = " + driver.getFullName() + ";" +
                "driver.age = " + driver.getAge() + ";" +
                "driver.sex = " + driver.getSex() + ";" +
                "driver.telephoneNumber = " + driver.getTelephoneNumber() + ";" +
                "driver.drivingExperience = " + driver.getDrivingExperience() + ";" +
                "engine.manufacturer = " + engine.getManufacturer() + ";" +
                "engine.capacity = " + engine.getCapacity() + ";";

    }
}
