package com.example.graphql.resolver;

import com.example.graphql.model.SportCar;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

@Service
public class SportCarResolver implements GraphQLResolver<SportCar> {

    public String getName(SportCar sportCar) {
        return sportCar.getName();
    }

    public Integer getSeatNumber(SportCar sportCar) {
        return sportCar.getSeatNumber();
    }

    public String getCategory(SportCar sportCar) {
        return sportCar.getCategory();
    }

}
