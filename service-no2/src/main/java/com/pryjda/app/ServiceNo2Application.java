package com.pryjda.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceNo2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceNo2Application.class, args);
    }

}
