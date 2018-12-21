package com.example.fcatcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FcatCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(FcatCenterApplication.class, args);
    }

}

