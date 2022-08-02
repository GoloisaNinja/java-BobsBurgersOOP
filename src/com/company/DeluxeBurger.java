package com.company;

public class DeluxeBurger extends BaseBurger {
    private String breadRollType;
    private String meat;
    private Toppings toppings;
    private String chipType;
    private String drink;
    private double base;

    // Constructor
    public DeluxeBurger(String breadRollType, String meat, Toppings toppings) {
        super(breadRollType, meat, toppings);
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.chipType = "Seasoned";
        this.drink = "Coke";
        this.base = 10.25;
    }

    // Setters
    public void setChipType(String chipType) {
        this.chipType = chipType;
    }
    public void setDrinkFlavor(String drink) {
        this.drink = drink;
    }

    @Override
    public void addLettuce(boolean lettuce) {
        System.out.println("Topping options not available on Deluxe Burger");
    }

    @Override
    public void addTomato(boolean tomato) {
        System.out.println("Topping options not available on Deluxe Burger");
    }

    @Override
    public void addCarrot(boolean carrot) {
        System.out.println("Topping options not available on Deluxe Burger");
    }

    @Override
    public void addOnion(boolean onion) {
        System.out.println("Topping options not available on Deluxe Burger");
    }

    @Override
    public double getBase() {
        return this.base;
    }

    @Override
    public String printReceipt() {
        return "**** Bob's Burgers ****" + "\n" +
               "Roll Type... " + this.breadRollType + "\n" +
               "Meat Type... " + this.meat + "\n" +
               "Chip Type... " + this.chipType + "\n" +
               "Drink... " + this.drink + "\n" +
               "Subtotal... " + "$" + getBase() + "\n" +
               "**** Total ... " + "$" + getBase() + " ****";
    }
}
