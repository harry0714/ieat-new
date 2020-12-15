package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.StoreType;

@Repository
public interface StoreTypeRepository extends JpaRepository<StoreType, String> {

}
