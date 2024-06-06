package Ejercicio04Boletin2;

public class Cliente {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private boolean active;
	private double peso;
	private double altura;
	public Cliente(String dni, String nombre, String apellidos, boolean active, double peso, double altura) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.active = active;
		this.peso = peso;
		this.altura = altura;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", active=" + active
				+ ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	public double calcularIMC() {
		double imc;
		imc=Math.pow(altura, peso);
		return imc;
	}
}
