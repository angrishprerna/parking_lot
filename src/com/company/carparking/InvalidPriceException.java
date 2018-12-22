package com.company.carparking;

class InvalidPriceException extends RuntimeException {

    InvalidPriceException(){
        System.out.println("Price should be less than $10");
    }

}
