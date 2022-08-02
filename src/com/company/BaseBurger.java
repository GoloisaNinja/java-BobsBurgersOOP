package com.company;

public class BaseBurger {
    private String breadRollType;
    private String meat;
    private Toppings toppings;
    private double base;

    // Constructor
    public BaseBurger(String breadRollType, String meat, Toppings toppings) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.toppings = toppings;
        this.base = 5.25;
    }

    // Setters
    public void addLettuce(boolean lettuce) {
        toppings.setLettuce(lettuce);
    }
    public void addTomato(boolean tomato) {
        toppings.setTomato(tomato);
    }
    public void addCarrot(boolean carrot) {
        toppings.setCarrot(carrot);
    }
    public void addOnion(boolean onion) {
        toppings.setOnion(onion);
    }

    // Getters
    public double getBase() {
        return this.base;
    }

    // Methods
    public String printReceipt() {
        double total = getBase() + this.toppings.getToppingCost();
        return "**** Bob's Burgers ****" + "\n" +
               "Roll Type... " + this.breadRollType + "\n" +
               "Meat Type... " + this.meat + "\n" +
               "Subtotal... " + "$" + getBase() + "\n" +
               this.toppings.toppingsMessage(getBase()) + "\n" +
               "**** Total ... " + "$" + total + " ****";
    }
}
