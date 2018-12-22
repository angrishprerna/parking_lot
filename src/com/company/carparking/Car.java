package com.company.carparking;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final List<Person> peopleInCar;
    private int maxNumberOfPeople;


    public Car(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
        peopleInCar = new ArrayList<>();

    }

    public void addPerson(Person person) throws CapacityLimitException {

        if (peopleInCar.size() < maxNumberOfPeople) {
            peopleInCar.add(person);
        } else {
            throw new CapacityLimitException("Car Full. Cannot add more people.");
        }

    }

    public List<Person> getPeopleInCar() {
        return peopleInCar;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public int getCount() {
        return peopleInCar.size();
    }
}
