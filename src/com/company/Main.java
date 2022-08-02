package com.company;

public class Main {

    public static void main(String[] args) {
        // Base Burger Tests
        Toppings toppings = new Toppings();
	    BaseBurger burger = new BaseBurger("Ciabatta", "Beef", toppings);
	    burger.addLettuce(true);
	    burger.addTomato(true);

        System.out.println(burger.printReceipt());

        System.out.println("------------------------");

        // Healthy Burger Tests
        Toppings healthyToppings = new Toppings();
        HealthyBurger healthyBurger = new HealthyBurger(healthyToppings);
        healthyBurger.addCapsicum(true);
        healthyBurger.addBeet(true);
        healthyBurger.addLettuce(true);

        System.out.println(healthyBurger.printReceipt());

        System.out.println("------------------------");

        // Deluxe Burger Tests
        Toppings deluxeToppings = new Toppings();
        DeluxeBurger deluxeBurger = new DeluxeBurger("Buttery Roll", "Beef", deluxeToppings);
        deluxeBurger.addLettuce(true);
        deluxeBurger.addOnion(true);
        deluxeBurger.setChipType("Garlic");
        deluxeBurger.setDrinkFlavor("Root Beer");
        System.out.println(deluxeBurger.printReceipt());
    }
}
