package ejercicio05;

public class Camarero extends Trabajador{
		
	private double propinas;
	private int nClientes;
	
	public Camarero(String nombre, String nCuenta, double sueldoBase, int anioTrabajados, double propinas,
			int nClientes) {
		super(nombre, nCuenta, sueldoBase, anioTrabajados);
		this.propinas = propinas;
		this.nClientes = nClientes;
	}
	public double getPropinas() {
		return propinas;
	}
	public void setPropinas(double propinas) {
		this.propinas = propinas;
	}
	public int getnClientes() {
		return nClientes;
	}
	public void setnClientes(int nClientes) {
		this.nClientes = nClientes;
	}
	@Override
	public String toString() {
		return super.toString()+"Camarero [propinas=" + propinas + ", nClientes=" + nClientes + "]";
	}
	
	public double calcularSueldo(int platosCocinados, int cantPorAnios, int dos, int veinte) {
		double sueldo;
		sueldo=super.calcularSueldo(platosCocinados, cantPorAnios, dos, veinte)+propinas+(nClientes*dos);
		return sueldo;
	}
	
}
