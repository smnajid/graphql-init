package com.example.graphql.model;


public class Car implements Vehicle {

    private String name;
    private Integer seatNumber;

    public Car(String name, Integer seatNumber) {
        this.name = name;
        this.seatNumber = seatNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }
}
