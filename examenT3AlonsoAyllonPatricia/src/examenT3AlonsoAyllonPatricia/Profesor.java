package examenT3AlonsoAyllonPatricia;

public class Profesor {
	
	private String nombre;
	private String apellido;
	private int id;
	private double sueldoBase;
	private int horasExtras;
	
	public Profesor(String nombre, String apellido, int id, double sueldoBase, int horasExtras) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.sueldoBase = sueldoBase;
		this.horasExtras = horasExtras;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", sueldoBase=" + sueldoBase
				+ ", horasExtras=" + horasExtras + "]";
	}
	
	public double calcularSueldoBruto(double cantHE) {
		return sueldoBase+cantHE*horasExtras;
	}

}
