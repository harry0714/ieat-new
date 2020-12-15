package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, String> {

}
