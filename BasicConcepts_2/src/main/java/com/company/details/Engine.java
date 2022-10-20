package com.company.details;

public class Engine {
    private String manufacturer;
    private String capacity;
    public void engine(String manufacturer, String capacity){
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getCapacity(){
        return this.capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
