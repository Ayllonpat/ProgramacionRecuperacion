package ejercicio05;

public class Chef extends Trabajador{
	
	private String especialidad;

	public Chef(String nombre, String nCuenta, double sueldoBase, int anioTrabajados, String especialidad) {
		super(nombre, nCuenta, sueldoBase, anioTrabajados);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return super.toString()  +"Chef [especialidad=" + especialidad + "]";
	}
	
	public double calcularSueldo(int platosCocinados, int cantPorAnios, int dos, int veinte) {
		double sueldo;
		sueldo=super.calcularSueldo(platosCocinados, cantPorAnios, dos, veinte)+(platosCocinados*4);
		return sueldo;
	}

}
