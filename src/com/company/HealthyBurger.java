package com.company;

public class HealthyBurger extends BaseBurger {
    private Toppings toppings;
    private double base;
    private double price;

    // Constructor
    public HealthyBurger(Toppings toppings) {
        super("Healthy Wheat", "Veggie Burger", toppings);
        this.toppings = toppings;
        this.base = 7.50;
    }

    // Setters
    public void addBeet(boolean beet) {
        toppings.setBeet(beet);
    }
    public void addCapsicum(boolean capsicum) {
        toppings.setCapsicum(capsicum);
    }

    @Override
    public double getBase() {
        return this.base;
    }
}
