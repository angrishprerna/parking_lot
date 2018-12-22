package com.company.carparking.test;

import com.company.carparking.Adult;
import com.company.carparking.Car;
import com.company.carparking.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    void createValidCar(){
        Car car =  new Car(4);
        Person person = new Adult()
        int maxPeople = car.getMaxNumberOfPeople();
        Assert.assertEquals("Car capacity is not same", 4, maxPeople );
    }

}