package com.example.graphql.resolver;

import com.example.graphql.model.Car;
import com.example.graphql.model.SportCar;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Service;

@Service
public class CarResolver implements GraphQLResolver<Car> {
}
