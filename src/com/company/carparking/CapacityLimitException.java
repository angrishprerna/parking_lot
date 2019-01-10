package com.company.carparking;

public class CapacityLimitException extends Exception {
    CapacityLimitException(String message){
        System.out.println(message);
    }
}
