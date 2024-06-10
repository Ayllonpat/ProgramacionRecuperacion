package examen;

public class Motos extends Vehiculo{
	private double cmCubicos;

	public Motos(int minsEstacionado, String matricula, double cmCubicos) {
		super(minsEstacionado, matricula);
		this.cmCubicos = cmCubicos;
	}

	public double getCmCubicos() {
		return cmCubicos;
	}

	public void setCmCubicos(double cmCubicos) {
		this.cmCubicos = cmCubicos;
	}

	@Override
	public String toString() {
		return super.toString()+"Motos [cmCubicos=" + cmCubicos + "]";
	}
	
	public double calcularPrecio(double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv) {
		double total;
		if(cmCubicos<limiteCmCubMotos) {
			total=super.calcularPrecio(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro,
					numDiv)/numDiv;
		}else {
			total=super.calcularPrecio(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
		}
		return total;
	}
}
