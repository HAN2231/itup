package com.example.itup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class RestaurantApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");

        /*Restaurant restaurant = new Restaurant();// 메모리 상에 Restaurant 생김
        // 주입
        restaurant.setName("miso restaurant");
        restaurant.setAddress("대전광역시 동구");
        restaurant.setPhone("010-2315-4985");
        Chef chef = new Chef();
        restaurant.setChef(chef);
        chef.setAge(57);
        chef.setName("백종원");
        System.out.println(restaurant);*/
        
        
        

        // 로그를 확인하고 싶을 떄 System.out.println을 사용하면 안됨.
        // log4j log4j2 slf4j와 같은 라이브러리를 사용해서 로그를 찍어야 함.

        // log.debug("restaurant: {}", restaurant);

        //Restaurant restaurant = new Restaurant();

        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);

        log.info("restaurant: {}", restaurant);
    }
}
