package com.harry.iLoveEat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harry.iLoveEat.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
