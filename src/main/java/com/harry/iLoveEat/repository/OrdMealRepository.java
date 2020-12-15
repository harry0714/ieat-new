package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.OrdMeal;

@Repository
public interface OrdMealRepository extends JpaRepository<OrdMeal, String> {

}
