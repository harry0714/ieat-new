package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.ArticleResponseReport;

@Repository
public interface ArticleResponseReportRepository extends JpaRepository<ArticleResponseReport, String> {

}
