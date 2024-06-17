package examen;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Oficina {
	
	private List<Trastero> listaTrasteros;

	public Oficina(List<Trastero> listaTrasteros) {
		super();
		this.listaTrasteros = listaTrasteros;
	}

	public List<Trastero> getListaTrasteros() {
		return listaTrasteros;
	}

	public void setListaTrasteros(List<Trastero> listaTrasteros) {
		this.listaTrasteros = listaTrasteros;
	}

	@Override
	public String toString() {
		return "Oficina [listaTrasteros=" + listaTrasteros + "]";
	}
	
	public void agregarNuevoTrastero(Trastero nt) {
		listaTrasteros.add(nt);
	}
	
	public void mostrarLista() {
		
		for (Iterator<Trastero> iterator = listaTrasteros.iterator(); iterator.hasNext();) {
			Trastero trastero = (Trastero) iterator.next();
			System.out.println(trastero);
		}				
	
	}
	
	public Trastero buscarPorPrecio(double precio){
		Trastero trasteroBuscado = null;
		for (Trastero trastero : listaTrasteros) {
			if(precio==trastero.getPrecio()) {
				trasteroBuscado=trastero;
			}
		}return trasteroBuscado;
	}
	public Trastero buscarLibrePorCalle(String calle){
		Trastero trasteroBuscado = null;
		for (Trastero trastero : listaTrasteros) {
			if(!trastero.isOcupado()&& trastero.getDireccion().equalsIgnoreCase(calle)) {
				trasteroBuscado=trastero;
			}
		}return trasteroBuscado;
	}
	
	public Trastero buscarPrecioMayor() {
		double precioMayor=0;
		Trastero trasteroBuscado = null;
		for (Trastero trastero : listaTrasteros) {
			if(trastero.getPrecio()>precioMayor) {
				precioMayor=trastero.getPrecio();
			}
		}
		for (Trastero trastero : listaTrasteros) {
			if(trastero.getPrecio()==precioMayor) {
				trasteroBuscado=trastero;
			}
		}
		return trasteroBuscado;
	}
	
	public Trastero buscarPorNum(int numBuscado) {
		Trastero trasteroBuscado = null;
		for (Trastero trastero : listaTrasteros) {
			if(trastero.getnTrastero()==numBuscado) {
				trasteroBuscado=trastero;
			}
		}return trasteroBuscado;
	}
	
	public void borrarNum(int numBuscado) {
		listaTrasteros.remove(buscarPorNum(numBuscado));
	}
	
	public void modificarPrecio(int numBuscado, double precio) {
		buscarPorNum(numBuscado).setPrecio(precio);
	}
	
	public Trastero buscarOcupado(){
		Trastero trasteroBuscado = null;
		for (Trastero trastero : listaTrasteros) {
			if(trastero.isOcupado()) {
				trasteroBuscado=trastero;
			}
		}return trasteroBuscado;
	}
	
	public void ordenarPorNumero() {
		Collections.sort(listaTrasteros);
	}
	
	public void ordenarPorPrecio() {
		Collections.sort(listaTrasteros);
	}
	
}
