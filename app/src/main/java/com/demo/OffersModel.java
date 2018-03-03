package com.demo;

class OffersModel {

    private String Offer;
    private int Savings;


    public OffersModel(String offer, int savings) {
        Offer = offer;
        Savings = savings;
    }

    public String getOffer() {
        return Offer;
    }

    public int getSavings() {
        return Savings;
    }
}
