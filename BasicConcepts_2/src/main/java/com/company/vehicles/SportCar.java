package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private String maxSpeed;

    public SportCar(String carBrand, String carClass, Driver driver, Engine engine, String maxSpeed) {
        super(carBrand, carClass, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public String getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start(){
        System.out.println("Warming up!");
        System.out.println("Let's go!");
    }
    @Override
    public void turnRight(){
        System.out.println("Sharp turn right");
    }
    @Override
    public void turnLeft(){
        System.out.println("Sharp turn left");
    }

    @Override
    public void stop(){
        System.out.println("Brake!");
    }
}
