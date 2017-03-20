package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Pratos;
import model.Reserva;
import model.Restaurante;

public class GestorReserva {
	ArrayList<Reserva> arrReserva;
	
	public GestorReserva() {
		this.arrReserva = new ArrayList<Reserva>();	
	}
	
	public void addRestaurante(int nCli, String hora, String data, ArrayList<Pratos> pratos, ArrayList<Restaurante> 
						restaurante,ArrayList<Cliente> cliente)  {
		Reserva r = new Reserva(nCli, hora, data, pratos,restaurante, cliente) ;
		arrReserva.add(r);
	}

}
