package com.mchindwhite;

public abstract class Beverage {
    //attributes
    private String description;

    //constructor

    public Beverage(String description) {
        super();
        this.description = description;
    }

    //getter
    public String getDescription() {
        return description;
    }

    //methods
    public abstract double cost();

}
