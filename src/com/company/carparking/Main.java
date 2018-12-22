package com.company.carparking;

public class Main {

    public static void main(String[] args) {

        try {
            // Parking Lot
            ParkingLot parkingLot = new ParkingLot(1, 9, "First");

            // Cars
            Car firstCar = new Car(1);
            Car secondCar = new Car(2);

            // People in firstCar
            Adult adult1 = new Adult("First Guy", 5);
            firstCar.addPerson(adult1);

            //People in secondCar
            Adult adult2 = new Adult("Second Guy", 20);
            Adult adult3 = new Adult("Third Guy", 20);
            Adult adult4 = new Adult("Fourth Guy", 20);


            secondCar.addPerson(adult2);
            secondCar.addPerson(adult3);
            secondCar.addPerson(adult4); // <- Exception


            //Cars in ParkingLot
            parkingLot.addCar(firstCar); // <- Exception
            parkingLot.addCar(secondCar);

            // MEMORIZE CTRL + ALT + L -> Reformats your code
            // CTRL + ALT + O -> O -> Optimizes imports
        } catch (Exception e) {

        }
    }
}


