package examen;

public class Furgonetas extends Vehiculo{

	private double longitud;

	public Furgonetas(int minsEstacionado, String matricula, double longitud) {
		super(minsEstacionado, matricula);
		this.longitud = longitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return super.toString()+"Furgonetas [longitud=" + longitud + "]";
	}
	
	/*¿Por qué pasas un Vehiculo? No lo usas dentro. Igual para matrícula
	 * No tiene el mismo número, orden y tipo de parámetros que el método de la interface o la madre
	 * por lo que no estás usando reescritura de métodos, sino sobrecarga. La firma tiene que ser igual.
	 * */
	public double calcularPrecio(double precioMin, double limiteFurgo, double limiteCmCubMotos,
			double cantPorMetro, double numDiv) {
		double total;
		if(longitud>limiteFurgo){
			total=((longitud-limiteFurgo)*cantPorMetro)+super.calcularPrecio(precioMin,
					limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
		}else {
			total=super.calcularPrecio(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv);
		}
		return total;
	}
	/*Ya que pasas los límite de la furgo y otros en el calcularPrecio ¿Por qué no lo pasas también aquí?
	 * Al final, aquí lo pones solo para 8 ¿?*/
	public void mostrarParkingEspecial() {
		double limiteFurgoAviso=8;
		if(longitud>limiteFurgoAviso){
			System.out.println("Debe aparcar en la zona especial.");
		}
	}
}
