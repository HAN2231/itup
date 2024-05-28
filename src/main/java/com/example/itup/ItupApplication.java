package com.example.itup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Repository;

@Slf4j
@SpringBootApplication
@ImportResource("classpath:root-context.xml")
public class ItupApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ItupApplication.class, args); //spring boot 사용
        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
        log.info("Restaurant: {}",restaurant);
    }

}
