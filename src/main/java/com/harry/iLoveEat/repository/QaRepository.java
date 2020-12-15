package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.Qa;

@Repository
public interface QaRepository extends JpaRepository<Qa, String> {

}
