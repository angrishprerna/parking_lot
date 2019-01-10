package com.company.carparking;

public class InvalidPriceException extends RuntimeException {

    InvalidPriceException(){
        System.out.println("Price should be less than $10");
    }

}
