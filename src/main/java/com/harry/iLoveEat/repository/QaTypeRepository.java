package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.QaType;

@Repository
public interface QaTypeRepository extends JpaRepository<QaType, String> {

}