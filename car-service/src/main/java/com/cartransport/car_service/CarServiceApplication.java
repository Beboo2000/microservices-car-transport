package com.cartransport.car_service;

import com.cartransport.car_service.model.Car;
import com.cartransport.car_service.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(CarRepository repository) {
        return args -> {
            repository.save(new Car("Model S", "Tesla", 79999.99));
            repository.save(new Car("Civic", "Honda", 25000.00));
            repository.save(new Car("Corolla", "Toyota", 22000.00));
        };
    }
}
