package com.cartransport.car_service.repository;

import com.cartransport.car_service.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {}
