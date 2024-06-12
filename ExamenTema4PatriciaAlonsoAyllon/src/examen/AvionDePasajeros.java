package examen;

public class AvionDePasajeros extends Avion{

	private int nPasajeros;

	public AvionDePasajeros(int id, double longitud, double lCombustible, int nPasajeros) {
		super(id, longitud, lCombustible);
		this.nPasajeros = nPasajeros;
	}

	public int getnPasajeros() {
		return nPasajeros;
	}

	public void setnPasajeros(int nPasajeros) {
		this.nPasajeros = nPasajeros;
	}

	@Override
	public String toString() {
		return super.toString()+"AvionDePasajeros [nPasajeros=" + nPasajeros + "]";
	}
	
	public double calcularPrecioAterrizaje(double cantPorMetro, double cantExtra, double limiteCombustible, 
			double cantPorPasajero, double extraPeligrosas) {
		// TODO Auto-generated method stub
		double total;
		
		total=super.calcularPrecioAterrizaje(cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, 
				extraPeligrosas)+cantPorPasajero*nPasajeros;		
		
		return total;
	}
	
}
