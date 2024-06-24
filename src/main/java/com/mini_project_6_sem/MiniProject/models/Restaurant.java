package com.mini_project_6_sem.MiniProject.models;

import com.mini_project_6_sem.MiniProject.utils.FoodType;
import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_location")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long restaurantID;

    @Column(name = "restaurant_name")
    private String restaurantName;

    @Embedded
    @Column(name = "address")
    private Address restaurantAddress;

    @Enumerated(EnumType.STRING)
    @Column(name = "food_type")
    private FoodType foodType;

    public Restaurant(Long restaurantID, String restaurantName, Address restaurantAddress,FoodType foodType) {
        this.restaurantID = restaurantID;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.foodType=foodType;
    }

    public Restaurant() {
    }

    public Long getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(Long restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Address getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(Address restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}