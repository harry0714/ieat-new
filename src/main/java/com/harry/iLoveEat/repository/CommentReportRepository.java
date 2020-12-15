package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.CommentReport;

@Repository
public interface CommentReportRepository extends JpaRepository<CommentReport, String> {

}
