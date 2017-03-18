package com.nadimmadani.calculator;

/**
 * Created by Nadim on 3/15/2017.
 */

public class TaxRateByZip {
    private double totalRate;
    private Rates rates;

    public TaxRateByZip(double totalRate) {
        this.totalRate = totalRate;
    }

    public TaxRateByZip(double totalRate, Rates rates) {
        this.totalRate = totalRate;
        this.rates = rates;
    }

    public double getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(double totalRate) {
        this.totalRate = totalRate;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }
}
