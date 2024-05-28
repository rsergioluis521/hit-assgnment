package com.example.hittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import soapClient.InventoryService;
import soapClient.InventoryServiceV2;

@SpringBootApplication
public class HitTestApplication {
    @Bean
    public InventoryService getInventoryService() {
        return new InventoryServiceV2().getInventoryServiceBinding();
    }

    public static void main(String[] args) {
        SpringApplication.run(HitTestApplication.class, args);
    }

}
