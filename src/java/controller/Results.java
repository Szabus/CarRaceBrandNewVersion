package controller;

import teams.Brand;

public class Results {

    private Brand brandName;
    private double result;

    public Results() {
    }

    public Results(Brand brandName, double result) {
        this.brandName = brandName;
        this.result = result;
    }

    public Brand getBrandName() {
        return brandName;
    }

    public double getResult() {
        return result;
    }

}
