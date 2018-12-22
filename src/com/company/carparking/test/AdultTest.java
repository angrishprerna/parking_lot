package com.company.carparking.test;

import com.company.carparking.Adult;
import org.junit.Assert;
import org.junit.Test;

public class AdultTest {

    @Test(expected = IllegalArgumentException.class)
    public void moneyCantBeNegative() {
        new Adult("Prerna", -5);
    }

    @Test
    public void createValidAdult() {
        // RUN PARTICULAR TEST CASE VIA CTRL + SHIFT + F10
        // Initialization
        Adult adult = new Adult("Prerna", 5);
        // Action
        double money = adult.getMoney();
        // Validation
        Assert.assertEquals("Money is not equal", 5, money, 0.00001);
    }


}