package com.PC.ParkingCreator.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.PC.ParkingCreator.model.Estabelecimento;
import com.PC.ParkingCreator.repository.EstabelecimentoRepository;

@RestController
@RequestMapping("/Estabelecimento")
public class EstabelecimentoResource {

	@Autowired
	private EstabelecimentoRepository er;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Estabelecimento> listaEstabelecimento() {
	Iterable<Estabelecimento> listaEstabelecimento = er.findAll();
	return listaEstabelecimento;
	}
	
	@PostMapping()
	public Estabelecimento CadastraEstabelecimento(@RequestBody @Valid Estabelecimento estabelecimento) {
		return er.save(estabelecimento);
	}
	
	@DeleteMapping()
	public void deletaEstabelecimento(@RequestBody Estabelecimento estabelecimento){
		er.delete(estabelecimento);
	}
}
