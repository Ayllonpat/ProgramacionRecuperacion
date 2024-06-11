package ejercicio05;

public class AyudanteCocina extends Trabajador{
	
	private int horasExtras;

	public AyudanteCocina(String nombre, String nCuenta, double sueldoBase, int anioTrabajados, int horasExtras) {
		super(nombre, nCuenta, sueldoBase, anioTrabajados);
		this.horasExtras = horasExtras;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public String toString() {
		return super.toString()+"AyudanteCocina [horasExtras=" + horasExtras + "]";
	}
	
	public double calcularSueldo(int platosCocinados, int cantPorAnios, int dos, int veinte) {
		double sueldo;
		sueldo=super.calcularSueldo(platosCocinados, cantPorAnios, dos, veinte)+(horasExtras*veinte);
		return sueldo;
	}

}
