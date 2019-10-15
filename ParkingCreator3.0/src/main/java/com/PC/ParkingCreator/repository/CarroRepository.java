package com.PC.ParkingCreator.repository;

import com.PC.ParkingCreator.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, String>{


}




