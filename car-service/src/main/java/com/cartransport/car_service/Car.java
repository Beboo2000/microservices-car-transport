package com.cartransport.car_service.model;

import jakarta.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String brand;
    private Double price;

    public Car() {}

    public Car(String name, String brand, Double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // getters & setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
