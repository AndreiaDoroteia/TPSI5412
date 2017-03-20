package aplication;
import java.util.Scanner;
import controller.*;

public class App {
	GestorCliente gcliente;
	GestorReserva greserva;
	GestorRestaurante grestaurante;
	
	
	public App(){
					
		gcliente = new GestorCliente();
		grestaurante = new GestorRestaurante();
		greserva = new GestorReserva();
		
	}
		
		

}
