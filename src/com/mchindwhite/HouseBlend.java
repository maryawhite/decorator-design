package com.mchindwhite;

public class HouseBlend extends Beverage{
    //constructor
    public HouseBlend() {
        super("House Blend");
    }

    //override abstract method from superclass
    @Override
    public double cost() {
        return 2.50;
    }
}
