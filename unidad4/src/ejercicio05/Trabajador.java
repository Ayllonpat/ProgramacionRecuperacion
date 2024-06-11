package ejercicio05;

public class Trabajador {
	
	private String nombre;
	private String nCuenta;
	private double sueldoBase;
	private int anioTrabajados;
	
	public Trabajador(String nombre, String nCuenta, double sueldoBase, int anioTrabajados) {
		super();
		this.nombre = nombre;
		this.nCuenta = nCuenta;
		this.sueldoBase = sueldoBase;
		this.anioTrabajados = anioTrabajados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getnCuenta() {
		return nCuenta;
	}

	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getAnioTrabajados() {
		return anioTrabajados;
	}

	public void setAnioTrabajados(int anioTrabajados) {
		this.anioTrabajados = anioTrabajados;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", nCuenta=" + nCuenta + ", sueldoBase=" + sueldoBase
				+ ", anioTrabajados=" + anioTrabajados + "]";
	}
	//cantPoranio habria q pasarlo por parametro en vez de 10
	public double calcularSueldo(int platosCocinados, int cantPorAnios, int dos, int veinte) {
		double sueldo;
		sueldo=sueldoBase+(cantPorAnios*anioTrabajados);
		return sueldo;
	}

}
