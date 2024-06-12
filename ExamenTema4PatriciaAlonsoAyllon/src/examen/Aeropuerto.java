package examen;

import java.util.Arrays;

public class Aeropuerto {
	
	private String nombre;
	private Avion listaAviones[];
	
	public Aeropuerto(String nombre, Avion[] listaAviones) {
		super();
		this.nombre = nombre;
		this.listaAviones = listaAviones;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Avion[] getListaAviones() {
		return listaAviones;
	}
	public void setListaAviones(Avion[] listaAviones) {
		this.listaAviones = listaAviones;
	}
	
	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", listaAviones=" + Arrays.toString(listaAviones) + "]";
	}
	
	public void mostrarListado() {
		for (int i = 0; i < listaAviones.length; i++) {
			System.out.println(listaAviones[i]);
			if(listaAviones[i] instanceof AvionDeMercancias) {
				((AvionDeMercancias)listaAviones[i]).avisarBomberos();
			}
		}
	}
	
	public double calcularAterrizajeUnAvion(Avion a, double cantPorMetro, double cantExtra, double limiteCombustible, 
			double cantPorPasajero, double extraPeligrosas) {

		return a.calcularPrecioAterrizaje(cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, limiteCombustible);
	}
	
	public double calcularTotalRecaudadoSoloPasajeros(double cantPorMetro, double cantExtra, double limiteCombustible, 
			double cantPorPasajero, double extraPeligrosas) {
		double total = 0;
		for (int i = 0; i < listaAviones.length; i++) {
			if(listaAviones[i] instanceof AvionDePasajeros) {
				total=total+calcularAterrizajeUnAvion(listaAviones[i], cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, extraPeligrosas);
			}
		}
		return total;
	}
	
	public double calcularTotalRecaudado(double cantPorMetro, double cantExtra, double limiteCombustible, 
			double cantPorPasajero, double extraPeligrosas) {
		double total = 0;
		for (int i = 0; i < listaAviones.length; i++) {
			total=total+calcularAterrizajeUnAvion(listaAviones[i], cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, extraPeligrosas);
		}
		return total;
	}
	
	public double calcularMediaMercancias(double cantPorMetro, double cantExtra, double limiteCombustible, 
			double cantPorPasajero, double extraPeligrosas) {
		double total = 0;
		int nAvionesMercancias=0;
		for (int i = 0; i < listaAviones.length; i++) {
			if(listaAviones[i] instanceof AvionDeMercancias) {
				total=total+calcularAterrizajeUnAvion(listaAviones[i], cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, extraPeligrosas);
				nAvionesMercancias++;
			}
		}
		return total/nAvionesMercancias;
	}

}
