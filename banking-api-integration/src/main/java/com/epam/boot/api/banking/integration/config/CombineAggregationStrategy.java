package com.epam.boot.api.banking.integration.config;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CombineAggregationStrategy implements AggregationStrategy {


    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        if (oldExchange == null) {
            return newExchange;
        }
        //Account acc = oldExchange.getIn().getBody(Account.class);
        //oldExchange.getIn().setBody(acc);
        return oldExchange;
    }


}