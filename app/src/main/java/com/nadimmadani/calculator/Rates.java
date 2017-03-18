package com.nadimmadani.calculator;

/**
 * Created by Nadim on 3/15/2017.
 */

public class Rates {
    private double rate;
    private String name;
    private String type;

    public Rates() {
    }



    public Rates(double rate, String name, String type) {
        this.rate = rate;
        this.name = name;
        this.type = type;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
