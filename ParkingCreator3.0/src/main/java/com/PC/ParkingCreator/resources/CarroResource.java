package com.PC.ParkingCreator.resources;

import com.PC.ParkingCreator.model.Carro;
import com.PC.ParkingCreator.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/Carro")
public class CarroResource {

	@Autowired
	private CarroRepository er;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Carro> listaCarro() {
	Iterable<Carro> listaCarro = er.findAll();
	return listaCarro;
	}
	
	@PostMapping()
 	public Carro cadastraCarro(@RequestBody @Valid Carro carro) {
		return er.save(carro);
	}
	
	@DeleteMapping()
	public void deletaCarro(@RequestBody Carro carro){
		er.delete(carro);
	}
	

	
	
}
