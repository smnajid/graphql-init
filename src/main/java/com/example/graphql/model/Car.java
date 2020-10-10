package com.example.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Car implements Vehicle {

    private String name;
    private Integer price;
    private Integer seatNumber;

}
