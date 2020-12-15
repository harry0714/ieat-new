package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.BookmarkStore;

@Repository
public interface BookmarkStoreRepository extends JpaRepository<BookmarkStore, String> {

}
