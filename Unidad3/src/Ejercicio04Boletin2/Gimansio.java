package Ejercicio04Boletin2;

import java.util.Arrays;

public class Gimansio {
	
	private Cliente[] listaClientes;
	private int nClientes;

	public Gimansio(Cliente[] listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}

	@Override
	public String toString() {
		return "Gimansio [listaClientes=" + Arrays.toString(listaClientes) + "]";
	}
	
	public void mostrarListaClientes() {
		for(int i = 0;i<listaClientes.length;i++) {
			System.out.println(listaClientes[i]);
		}
	}
	
	public void addClienteToLista(Cliente c) {
		listaClientes[nClientes++] = c;
	}
	
	public Cliente findByDni(String dni) {
		boolean encontrado=false;
		Cliente clienteEncontrado=null;
		for(int i=0; i<listaClientes.length && !encontrado;i++) {
			if(listaClientes[i].getDni().equalsIgnoreCase(dni)) {
				encontrado=true;
				clienteEncontrado=listaClientes[i];
			}
		}
		return clienteEncontrado;
	}
	
	public double calcularMediaIMC() {
		double total = 0;
		for(int i =0; i<listaClientes.length;i++) {
			total += listaClientes[i].calcularIMC();
		}
		return total/listaClientes.length;
	}
	
	public void estanDeBaja() {
		for(int i =0;i<listaClientes.length;i++) {
			if(listaClientes[i].getActive()!=true) {
				System.out.println(listaClientes[i]);
			}
		}
	}

}
