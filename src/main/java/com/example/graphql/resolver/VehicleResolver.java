package com.example.graphql.resolver;

import com.example.graphql.model.Car;
import graphql.kickstart.tools.GraphQLResolver;

public abstract class VehicleResolver<T> implements GraphQLResolver<Car> {
    String getName(T v){
        return "value";
    }

}
