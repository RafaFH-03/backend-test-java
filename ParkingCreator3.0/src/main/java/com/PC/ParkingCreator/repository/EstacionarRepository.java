package com.PC.ParkingCreator.repository;

import com.PC.ParkingCreator.model.Estacionar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstacionarRepository extends JpaRepository<Estacionar, String>{


}




