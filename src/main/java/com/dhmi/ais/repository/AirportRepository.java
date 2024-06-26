package com.dhmi.ais.repository;

import com.dhmi.ais.domain.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {

    Optional<Airport> findByName(String name);
//    findByCountry
}
