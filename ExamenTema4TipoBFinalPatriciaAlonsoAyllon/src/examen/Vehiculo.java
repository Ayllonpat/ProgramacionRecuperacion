package examen;

public class Vehiculo implements IAparcamiento{
	
	private int minsEstacionado;
	private String matricula;

	public Vehiculo(int minsEstacionado, String matricula) {
		super();
		this.minsEstacionado = minsEstacionado;
		this.matricula = matricula;
	}

	public int getMinsEstacionado() {
		return minsEstacionado;
	}

	public void setMinsEstacionado(int minsEstacionado) {
		this.minsEstacionado = minsEstacionado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [minsEstacionado=" + minsEstacionado + ", matricula=" + matricula + "]";
	}

	//No es necesaria la variable total, puedes poner directamente en el return la multiplicación
	public double calcularPrecio(double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv) {
		// TODO Auto-generated method stub
		double total=0;
		total=minsEstacionado*precioMin;
		return total;
	}
	
}
