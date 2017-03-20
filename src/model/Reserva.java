package model;

import java.util.ArrayList;

public class Reserva {
	
	private int nCli; // numero clientes
	private String hora;
	private String data;
	ArrayList<Pratos> arrpratos;
	ArrayList<Restaurante> arrestaurante;
	ArrayList<Cliente> arrcliente;
	
	
	public Reserva(int nCli, String hora, String data, ArrayList<Pratos> pratos, ArrayList<Restaurante> restaurante,
			ArrayList<Cliente> cliente) {
		super();
		this.nCli = nCli;
		this.hora = hora;
		this.data = data;
		this.arrpratos = pratos;
		this.arrestaurante = restaurante;
		this.arrcliente = cliente;
	}
	public int getnCli() {
		return nCli;
	}
	public void setnCli(int nCli) {
		this.nCli = nCli;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public ArrayList<Pratos> getPratos() {
		return arrpratos;
	}
	public void setPratos(ArrayList<Pratos> pratos) {
		this.arrpratos = pratos;
	}
	public ArrayList<Restaurante> getRestaurante() {
		return arrestaurante;
	}
	public void setRestaurante(ArrayList<Restaurante> restaurante) {
		this.arrestaurante = restaurante;
	}
	public ArrayList<Cliente> getCliente() {
		return arrcliente;
	}
	public void setCliente(ArrayList<Cliente> cliente) {
		this.arrcliente = cliente;
	}
	
	
	

}
