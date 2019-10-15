package com.PC.ParkingCreator.resources;

import com.PC.ParkingCreator.model.Estacionar;
import com.PC.ParkingCreator.repository.EstacionarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/Estacionar")
public class EstacionarResource {

	@Autowired
	private EstacionarRepository er;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Estacionar> listaEstacionar() {
	Iterable<Estacionar> listaEstacionar = er.findAll();
	return listaEstacionar;
	}
	
	@PostMapping()
 	public Estacionar cadastraEstacionar(@RequestBody @Valid Estacionar estacionar) {
		return er.save(estacionar);
	}
	
	@DeleteMapping()
	public void deletaEstacionar(@RequestBody Estacionar estacionar){
		er.delete(estacionar);
	}
	

	
	
}
