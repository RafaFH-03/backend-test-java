package com.PC.ParkingCreator.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Estacionar {

        @javax.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long Id;

        @NotNull
        private int Id_Carro;

        @NotNull
        private int Id_Estabelecimento;
 
        private Timestamp  Data_Entrada ;

        
        private Timestamp Data_Saida ;
        
        
        
        
        public long getId() {
			return Id;
		}

		public void setId(long id) {
			Id = id;
		}

		public int getId_Carro() {
			return Id_Carro;
		}

		public void setId_Carro(int id_Carro) {
			Id_Carro = id_Carro;
		}

		public int getId_Estabelecimento() {
			return Id_Estabelecimento;
		}

		public void setId_Estabelecimento(int id_Estabelecimento) {
			Id_Estabelecimento = id_Estabelecimento;
		}

		public Timestamp getData_Entrada() {
			return Data_Entrada;
		}

		public void setData_Entrada(Timestamp data_Entrada) {
			Data_Entrada = data_Entrada;
		}

		public Timestamp getData_Saida() {
			return Data_Saida;
		}

		public void setData_Saida(Timestamp data_Saida) {
			Data_Saida = data_Saida;
		}



}
