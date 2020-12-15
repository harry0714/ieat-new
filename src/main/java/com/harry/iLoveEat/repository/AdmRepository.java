package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.Administrator;

@Repository
public interface AdmRepository extends JpaRepository<Administrator, String> {

}
