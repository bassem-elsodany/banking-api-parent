package com.epam.boot.api.banking.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.epam.boot.api.banking"})
public class BankingApiApplication {

    private static final Logger logger = LoggerFactory.getLogger(BankingApiApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(BankingApiApplication.class, args);
        logger.info("BankingApiApplication Started........");
    }

}

