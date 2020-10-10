package com.example.graphql.publishers;

import com.example.graphql.model.StockPriceUpdate;
import com.example.graphql.query.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
public class PersonPublisher {

    private  Flux<Person> publisher;

    private EventProcessor eventProcessor;

    public PersonPublisher(EventProcessor eventProcessor) {
        this.eventProcessor = eventProcessor;
        publisher = Flux.create(sink -> {
            eventProcessor.register(
                    new EventListener() {
                        @Override
                        public void onEvent(Person person) {
                            sink.next(person);
                        }
                    });
        });

    }

    public Flux<Person> getPublisher() {
        return publisher;
    }
}
