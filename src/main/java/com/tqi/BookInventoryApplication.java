package com.tqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class BookInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookInventoryApplication.class, args);
    }

}
