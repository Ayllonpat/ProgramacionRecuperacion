package examen;

public class Avion implements IAterrizaje{
	
	private int id;
	private double longitud;
	private double lCombustible;
	public Avion(int id, double longitud, double lCombustible) {
		super();
		this.id = id;
		this.longitud = longitud;
		this.lCombustible = lCombustible;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getlCombustible() {
		return lCombustible;
	}
	public void setlCombustible(double lCombustible) {
		this.lCombustible = lCombustible;
	}
	@Override
	public String toString() {
		return "Avion [id=" + id + ", longitud=" + longitud + ", lCombustible=" + lCombustible + "]";
	}

	@Override
	public double calcularPrecioAterrizaje(double cantPorMetro, double cantExtra, double limiteCombustible,
			double cantPorPasajero, double extraPeligrosas) {
		// TODO Auto-generated method stub
		double total;
		total=cantPorMetro*longitud;
		
		if(lCombustible>=limiteCombustible) {
			total=total+cantExtra;
		}
		
		return total;
	}
	
	

}
