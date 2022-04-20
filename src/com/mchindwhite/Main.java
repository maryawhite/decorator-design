package com.mchindwhite;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HouseBlend houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + ": + $" + houseBlend.cost());

        Milk milkAddOn = new Milk(houseBlend);
        System.out.println(milkAddOn.getDescription() + ": $" + milkAddOn.cost());

        Sugar sugarAddOn = new Sugar(milkAddOn);
        System.out.println(sugarAddOn.getDescription() + ": $" + sugarAddOn.cost());

        DarkRoast dark = new DarkRoast();
        System.out.println(dark.getDescription() + ": $" + dark.cost());

        Sugar darkSug = new Sugar(dark);
        System.out.println(darkSug.getDescription() + ": $" + darkSug.cost());
    }
}
