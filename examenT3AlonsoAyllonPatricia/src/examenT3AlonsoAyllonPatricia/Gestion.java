package examenT3AlonsoAyllonPatricia;

public class Gestion {
	
	Profesor p;

	public Gestion(Profesor p) {
		super();
		this.p = p;
	}

	public Profesor getP() {
		return p;
	}

	public void setP(Profesor p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Gestion [p=" + p + "]";
	}
	
	public double calcularSueldoNeto(double cantHE, double impuestos) {
		double cien=100;
		return p.calcularSueldoBruto(cantHE)-p.calcularSueldoBruto(cantHE)*(impuestos/cien);
	}
	
	public boolean comprobarHorasExtras() {
		if(p.getHorasExtras()>40) {
			return true;
		}else {
			return false;
		}
	}
	
	public void imprimirMensajeHorasExtras() {
		if(comprobarHorasExtras()==true) {
			System.out.println("El trabajador se ha pasado de horas extras");
		}else {
			System.out.println("El trabajador no se ha pasado de horas extras");
		}
	}
	
	public double comprobarAhorros(double cantHE, double impuestos, double gastado) {
		return calcularSueldoNeto(cantHE, impuestos) - gastado;
	}
	
	public void comprobarNSueldoNegativo(double nSueldoBase) {
		if(nSueldoBase<0) {	
			System.out.println("El sueldo es negativo");		
		}
	}
	
	public void cambiarSueldoBase(double nSueldoBase) {
		if(nSueldoBase>0) {	
			p.setSueldoBase(nSueldoBase);			
		}else {
			comprobarNSueldoNegativo(nSueldoBase);
		}
	}
}
