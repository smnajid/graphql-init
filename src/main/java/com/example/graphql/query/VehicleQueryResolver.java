package com.example.graphql.query;

import com.example.graphql.model.Car;
import com.example.graphql.model.SportCar;
import com.example.graphql.model.Vehicle;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

@Service
public class VehicleQueryResolver implements GraphQLQueryResolver {


    public Collection<Vehicle> vehicles() {
        return Arrays.asList(
                Car.builder().name("Smart").price(15).seatNumber(2).build(),
                Car.builder().name("Serie 3").price(25).seatNumber(4).build(),
                SportCar.builder().name("Maclaren").price(100).seatNumber(1).category("Formule 1").build()
        );
    }
}
