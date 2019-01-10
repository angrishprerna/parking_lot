package com.company.carparking;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParkingLot implements HasFees, Nameable {

    private int maxNumberOfCars;
    private float entryPrice;
    private String parkingLotName;
    private static final List<Car> carsParked = new ArrayList<>();

    public ParkingLot(int maxNumberOfCars, float entryPrice, String parkingLotName) {
        this.maxNumberOfCars = maxNumberOfCars;
        this.entryPrice = entryPrice;
        if (this.entryPrice >= 10.0f) {
            throw new InvalidPriceException();
        }

        if (checkName(parkingLotName)) {
            throw new IllegalArgumentException("Name can only take letters");
        } else {
            this.parkingLotName = parkingLotName;
        }
    }

    @Override
    public String getName() {
        return this.parkingLotName;
    }

    @Override
    public double getFees() {
        return this.entryPrice;
    }

    public void addCar(Car car) throws CapacityLimitException {
        if (carsParked.size() < maxNumberOfCars) {
            // Another constraint
            Adult driver = (Adult)car.getPeopleInCar().get(0);
            if (driver.getMoney() >= entryPrice) {
                carsParked.add(car);
            } else {
                System.out.println("Driver does not have enough money to park.");
            }

        } else {
            throw new CapacityLimitException("Parking Lot Full. Cannot add more cars.");
        }
    }

    public int count() {
        return carsParked.size();
    }

    public int getMaxNumberOfCars() {
        return maxNumberOfCars;
    }

    private boolean checkName(String parkingLotName) {
        Pattern p = Pattern.compile("[^a-zA-Z ]");
        Matcher m = p.matcher(parkingLotName);
        boolean b = m.find();

        return b;
    }

}
