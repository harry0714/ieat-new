package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.StoreComment;

@Repository
public interface StoreCommentRepository extends JpaRepository<StoreComment, String> {

}
