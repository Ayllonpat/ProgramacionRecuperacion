package Ejercicio06;

public class Jugador implements Comparable<Jugador>{
	
	private String nombre;
	private String posicion;
	private int nCamiseta;
	public Jugador(String nombre, String posicion, int nCamiseta) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.nCamiseta = nCamiseta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getnCamiseta() {
		return nCamiseta;
	}
	public void setnCamiseta(int nCamiseta) {
		this.nCamiseta = nCamiseta;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", nCamiseta=" + nCamiseta + "]";
	}
	
	public int compareTo(Jugador j) {
		return j.getPosicion().toLowerCase().compareTo(j.posicion.toLowerCase());
	}

}
