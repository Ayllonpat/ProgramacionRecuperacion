package examen;

import java.util.Arrays;

public class Parking {
	private String direccion;
	private Vehiculo []lista;
	
	public Parking(String direccion, Vehiculo []lista) {
		super();
		this.direccion = direccion;
		this.lista = lista;
	}
		
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Vehiculo[] getLista() {
		return lista;
	}
	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "Parking [direccion=" + direccion + ", lista=" + Arrays.toString(lista) + "]";
	}

	//Bien
	public void mostrarLista() {
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
			if(lista[i] instanceof Furgonetas) {
				((Furgonetas)lista[i]).mostrarParkingEspecial();
			}
		}
	}
	
	/*
	 * En el nombre debería aparecer el criterio por el que se busca, es decir, el método se debería llamar
	 * "buscarPorMatricula".
	 * Se debería usar equalsIgnoreCase, para evitar problemas con mayúsculas y minúsculas
	 * */
	public Vehiculo buscar(String matricula) {
		Vehiculo vehiculo = null;
		boolean encontrado = false;
		for(int i=0;i<lista.length && !encontrado ;i++) {			
			if(lista[i].getMatricula().equals(matricula)) {
				vehiculo=lista[i];	
			}
		}
		return vehiculo;
	}
	
	/*
	 * Aquí no va un método calcularPrecio, ese ya es el que has reescrito en las clases de la herencia
	 * Aquí va uno que se llama calcularPrecioUnVehiculo, que es un método distinto al que se le pasa
	 * un Vehiculo como parámetro (o la matrícula si busca dentro, pero lo ideal es pasar el Vehiculo)
	 * y lo único quer hacees llamar al reescrito (esto sí está bien)
	 * En resumen, el nombre de este método no puede ser el del reescrito, debe ser diferente
	 * */
	public double calcularPrecio(String matricula, double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv) {
		double precio;
		
		precio=buscar(matricula).calcularPrecio(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
		return precio;
	}
	
	/*
	 * No hay que castear dentro del if, ya solo entra en el if cuando son instancias de motos
	 * por lo que puede llamar al método reescrito. El cálculo bien.
	 * */
	
	public double calcularPrecioMotos(double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv) {
		double recaudadoMotos=0;
		
		for(int i=0;i<lista.length;i++) {
		
			if(lista[i] instanceof Motos) {
				recaudadoMotos=((Motos)lista[i]).calcularPrecio(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
			}
		}
		return recaudadoMotos;
	}
	
	//Bien
	public double calcularPrecioNavidad(String matricula, double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv, double sumaNavidad) {
		double precio;
		
		precio=buscar(matricula).calcularPrecio(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
		return precio+sumaNavidad;
	}
	
	//Falta calcularPrecioUnVehiculo
}
