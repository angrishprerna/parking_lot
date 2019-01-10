package com.company.carparking.test;

import com.company.carparking.Adult;
import com.company.carparking.CapacityLimitException;
import com.company.carparking.Car;
import com.company.carparking.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void createValidCar() throws CapacityLimitException {
        Car car =  new Car(4);
        Person person = new Adult("Adam", 8);
        car.addPerson(person);
        int maxPeople = car.getMaxNumberOfPeople();
        Assert.assertEquals("Car capacity is les", 4, maxPeople );
    }

    @Test (expected = CapacityLimitException.class)
    public void addPeopleBeyondCapacity() throws CapacityLimitException{
        Car car =  new Car(0);
        Person person = new Adult("Adam", 8);
        car.addPerson(person);
    }

}