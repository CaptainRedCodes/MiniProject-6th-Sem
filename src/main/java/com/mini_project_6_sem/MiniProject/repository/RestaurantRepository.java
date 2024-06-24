package com.mini_project_6_sem.MiniProject.repository;

import com.mini_project_6_sem.MiniProject.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
