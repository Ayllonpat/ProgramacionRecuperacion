package ejercicio05;

import java.util.Arrays;
import java.util.Iterator;

public class Restaurante {
	
	private String nombre;
	
	public Restaurante(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + "]";
	}
	
	public double calcularPaga (Trabajador t, int platosCocinados, int cantPorAnios, int dos, int veinte) {
		return t.calcularSueldo(platosCocinados, cantPorAnios, dos, veinte);
	}
	
	public double calcularNominas(Trabajador []listaTrabajadores, int platosCocinados, int cantPorAnios, int dos, int veinte) {
		double total=0;
		for (int i = 0; i < listaTrabajadores.length; i++) {
			total=total+calcularPaga(listaTrabajadores[i], platosCocinados, cantPorAnios, dos, veinte);
		}
		return total;
	}
	
}
