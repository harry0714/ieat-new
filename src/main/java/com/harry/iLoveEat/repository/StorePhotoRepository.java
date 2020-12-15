package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.StorePhoto;

@Repository
public interface StorePhotoRepository extends JpaRepository<StorePhoto, String> {

}
