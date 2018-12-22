package com.company.carparking;

public class Adult extends Person implements HasMoney {

    private String adultName;
    private double money;

    public Adult(String adultName, float money) {
        super(adultName);
        this.adultName = adultName;
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.money = money;
        }

    }

    public double getMoney() {
        return money;
    }

    @Override
    public String getName() {
        return adultName;
    }

    @Override
    public double getBalance() {
        // If the Adult is the driver, balance will return money - entryPrice
        return getMoney();
    }

}
