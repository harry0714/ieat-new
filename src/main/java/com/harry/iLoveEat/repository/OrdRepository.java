package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.Ord;

@Repository
public interface OrdRepository extends JpaRepository<Ord, String> {

}
