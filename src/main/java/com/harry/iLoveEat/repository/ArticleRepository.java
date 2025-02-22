package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, String> {

}
