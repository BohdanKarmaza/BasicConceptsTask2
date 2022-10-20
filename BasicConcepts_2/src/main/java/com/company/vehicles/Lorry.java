package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private String loadCapacity;

    public Lorry(String carBrand, String carClass, Driver driver, Engine engine, String loadCapacity) {
        super(carBrand, carClass, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public String getLoadCapacity(){
        return this.loadCapacity;
    }
    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void turnLeft(){
        System.out.println("Slowing down");
        System.out.println("Turning left!");
    }

    @Override
    public void turnRight() {
        System.out.println("Slowing down");
        System.out.println("Turning right!");
    }

    @Override
    public void start() {
        System.out.println("Starting on Lorry");
    }

    @Override
    public void stop() {
        System.out.println("Stopping on Lorry");
    }
}
