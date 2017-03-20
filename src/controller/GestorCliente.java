package controller;

import java.util.ArrayList;

import model.Cliente;

public class GestorCliente {
	ArrayList<Cliente> arCliente;
	
	public GestorCliente() {
		this.arCliente = new ArrayList<Cliente>();	
	}
	public void addClient(String nome, String morada, String email, String telefone) {
		Cliente c = new Cliente(nome, morada, email, telefone);
		int novoId = arCliente.size();
		c.setId(novoId);		
		arCliente.add(c);
		
	}
	
	public Cliente getCliente(int id) {
		for (Cliente c : arCliente) {
			if (c.getId() == id)
				return c;
		}
		return null;
	}
	
	public void consultaCliente(int pos){
		for (Cliente cli : arCliente) {
			if (cli.getId() == pos){
				System.out.printf("ID: %d", cli.getId());
				System.out.printf("Nome: %s", cli.getNome());
				System.out.printf("Morada: %s", cli.getMorada());
				System.out.printf("Email: %s", cli.getEmail());
				System.out.printf("Telefone: %d", cli.getTelefone());
			}
				
		}
	}
	

}
