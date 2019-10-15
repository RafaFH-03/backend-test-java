package com.PC.ParkingCreator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Estabelecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@NotBlank
	private String Nome;	
	
	@NotBlank
	private String CNPJ;
	
	@NotBlank
	private String Endereco;
	
	@NotBlank
	private String Telefone;
	
	@NotNull
	private int Quantidade_vagas_para_motos;
	
	@NotNull
	private int Quantidade_vagas_para_carros;
	
	
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public int getQuantidade_vagas_para_motos() {
		return Quantidade_vagas_para_motos;
	}
	public void setQuantidade_vagas_para_motos(int quantidade_vagas_para_motos) {
		Quantidade_vagas_para_motos = quantidade_vagas_para_motos;
	}
	public int getQuantidade_vagas_para_carros() {
		return Quantidade_vagas_para_carros;
	}
	public void setQuantidade_vagas_para_carros(int quantidade_vagas_para_carros) {
		Quantidade_vagas_para_carros = quantidade_vagas_para_carros;
	}
	
	
}
