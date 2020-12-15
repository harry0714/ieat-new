package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, String> {

}