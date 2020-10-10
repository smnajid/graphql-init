package com.example.graphql.resolver;

import com.example.graphql.model.StockPriceUpdate;
import com.example.graphql.publishers.PersonPublisher;
import com.example.graphql.publishers.StockTickerReactorPublisher;
import com.example.graphql.query.Person;
import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class Subscription implements GraphQLSubscriptionResolver {

    private StockTickerReactorPublisher stockTickerPublisher;
    private PersonPublisher personPublisher;

    Subscription(StockTickerReactorPublisher stockTickerPublisher, PersonPublisher personPublisher) {
        this.stockTickerPublisher = stockTickerPublisher;
        this.personPublisher = personPublisher;
    }

    Publisher<StockPriceUpdate> stockQuotes(List<String> stockCodes) {
        return stockTickerPublisher.getPublisher(stockCodes);
    }

    Publisher<Person> personUpdate() {
        return personPublisher.getPublisher();
    }

}
