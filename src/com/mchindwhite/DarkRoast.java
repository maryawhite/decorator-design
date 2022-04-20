package com.mchindwhite;

public class DarkRoast extends Beverage{
    //constructor
    public DarkRoast() {
        super("Dark Roast");
    }

    //override abstract method from superclass
    @Override
    public double cost() {
        return 2.75;
    }
}
