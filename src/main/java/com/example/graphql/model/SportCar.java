package com.example.graphql.model;


public class SportCar extends Car {

    public SportCar(String name, Integer seatNumber) {
        super(name, seatNumber);
    }

    public SportCar(String name, Integer seatNumber, String category) {
        super(name, seatNumber);
        this.category = category;
    }

    private String category;


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
