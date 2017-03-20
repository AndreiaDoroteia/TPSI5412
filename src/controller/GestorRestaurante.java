package controller;

import java.util.ArrayList;

import model.Reserva;
import model.Restaurante;

public class GestorRestaurante {
	ArrayList<Restaurante> arRestaurante;
	
	public GestorRestaurante() {
		this.arRestaurante = new ArrayList<Restaurante>();	
	}
	
	public void addRestaurante(String nome, String morada, String email, String telefone) {
		Restaurante r = new Restaurante(nome, morada, email, telefone);
		int novoId = arRestaurante.size();
		r.setId(novoId);		
		arRestaurante.add(r);
	}
	
	public void mostraPratos(Restaurante r, Reserva num){
		for(int i=0;i<r.getArrReserva(num).arrPratos.size;i++){
			System.out.println("Numero pratos : %d ",r.getArrReserva(num).getarrPratos(i).getQuantidade);			
			System.out.println("Tipo pratos : %s ",r.getArrReserva(num).getarrPratos(i).getDescricao);		
		}
	}
}
