package com.company.carparking.test;

import com.company.carparking.*;
import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {

    @Test
    public void createValidParkingLotForCapacity(){
        ParkingLot parkingLot = new ParkingLot(2, 5, "Waterloo");
        int maxCars = parkingLot.getMaxNumberOfCars();
        Assert.assertEquals("Capacity is not equal", 2, maxCars);
    }

    @Test
    public void createValidParkingLotForEntryPrice(){
        ParkingLot parkingLot = new ParkingLot(2,5,"Toronto");
        double price =  parkingLot.getFees();
        Assert.assertEquals(5, price, 0.00001);
    }

    @Test (expected = InvalidPriceException.class)
    public void createInvalidFees(){
        ParkingLot parkingLot = new ParkingLot(2,15,"Ottawa");
    }

    @Test (expected = IllegalArgumentException.class)
    public void createInvalidName(){
        ParkingLot parkingLot = new ParkingLot(2,9, "ab12");
    }

    @Test (expected = CapacityLimitException.class)
    public void addsCarsBeyondCapacity() throws  CapacityLimitException {
        ParkingLot parkingLot = new ParkingLot(0, 9, "abc");
        Car car = new Car(1);
        parkingLot.addCar(car);
    }

    @Test
    public void addCarsWithoutFunds() throws CapacityLimitException{
        ParkingLot parkingLot = new ParkingLot(1,9,"abc");
        Car car = new Car(1);
        Adult adult = new Adult("Prerna", 5);
        car.addPerson(adult);
        parkingLot.addCar(car);
        int carsInParkingLot = parkingLot.count();
        Assert.assertEquals("Incorrect number of cars in the lot", 0, carsInParkingLot);
    }

    @Test
    public void addCarsWithFunds() throws CapacityLimitException{
        ParkingLot parkingLot = new ParkingLot(1,9,"abc");
        Car car = new Car(2);
        Adult adult = new Adult("Prerna", 15);
        car.addPerson(adult);
        parkingLot.addCar(car);
        int carsInParkingLot = parkingLot.count();
        Assert.assertEquals("Incorrect number of cars in the lot", 1, carsInParkingLot);
    }
}
