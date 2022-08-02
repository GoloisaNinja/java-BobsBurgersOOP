package com.company;

public class Toppings {
    private boolean lettuce;
    private double lettuceCost = 0.00;
    private boolean tomato;
    private double tomatoCost = 0.00;
    private boolean carrot;
    private double carrotCost = 0.00;
    private boolean onion;
    private double onionCost = 0.00;
    private boolean beet;
    private double beetCost = 0.00;
    private boolean capsicum;
    private double capsicumCost = 0.00;

    // Constructor
    public Toppings() {
        this.lettuce = false;
        this.tomato = false;
        this.carrot = false;
        this.onion = false;
        this.beet = false;
        this.capsicum = false;
    }

    // Setters
    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        this.lettuceCost = lettuce ? 0.50 : 0.00;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
        this.tomatoCost = tomato ? 0.75 : 0.00;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
        this.carrotCost = carrot ? 0.25 : 0.00;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
        this.onionCost = onion ? 0.15 : 0.00;
    }

    public void setBeet(boolean beet) {
        this.beet = beet;
        this.beetCost = beet ? 0.65 : 0.00;
    }

    public void setCapsicum(boolean capsicum) {
        this.capsicum = capsicum;
        this.capsicumCost = capsicum ? 0.45 : 0.00;
    }

    // Methods
    public double getToppingCost() {
        return this.lettuceCost +
               this.tomatoCost +
               this.carrotCost +
               this.onionCost +
               this.beetCost +
               this.capsicumCost;
    }

    public String toppingsMessage(double type) {
        String baseMsg = "**** Toppings ****" + "\n" +
               "Lettuce ... " + "$" + this.lettuceCost + "\n" +
               "Tomato ... " + "$" + this.tomatoCost + "\n" +
               "Carrot ... " + "$" + this.carrotCost + "\n" +
               "Onion ... " + "$" + this.onionCost + "\n";

        String healthyMsg = baseMsg +
                            "Beet ... " + "$" + this.beetCost + "\n" +
                            "Capsicum ... " + "$" + this.capsicumCost + "\n";
        String subTotalMsg = "**** Toppings Subtotal ... " + "$" + this.getToppingCost() + " ****";
        String itemizedMessage = type == 5.25 ? baseMsg + subTotalMsg :
                healthyMsg + subTotalMsg;
        return itemizedMessage;
    }
}
