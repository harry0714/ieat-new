package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.StoreReport;

@Repository
public interface StoreReportRepository extends JpaRepository<StoreReport, String> {

}
