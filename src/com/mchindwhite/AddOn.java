package com.mchindwhite;

public abstract class AddOn extends Beverage{
    //new attribute
    protected Beverage beverage;

    //constructor
    public AddOn(String description, Beverage bev) {
        super(description);
        this.beverage = bev;
    }

    //new abstract method
    public abstract String getDescription();

}

//the AddOn class is our decorator. Note that it is abstract and extends Beverage.
//It has an attribute of type Beverage. and an abstract method called getDescription.
//Note that it does not override the cost method from the superclass.
