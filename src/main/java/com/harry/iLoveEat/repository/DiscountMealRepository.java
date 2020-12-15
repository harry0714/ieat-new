package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.Discount;

@Repository
public interface DiscountMealRepository extends JpaRepository<Discount, String> {

}
