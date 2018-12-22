package com.company.carparking;

class CapacityLimitException extends Exception {
    CapacityLimitException(String message){
        System.out.println(message);
    }
}
