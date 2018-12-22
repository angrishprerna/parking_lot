package com.company.carparking;

public abstract class Person implements Nameable {
    private String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    @Override
    public String getName() {
        return personName;
    }
}
