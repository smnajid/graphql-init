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
                new Car("Smart", 2),
                new Car("Serie", 5),
                new SportCar("Maclaren", 1, "Formule 1")
        );
    }
}
