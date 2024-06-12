package examen;

public class AvionDeMercancias extends Avion{
	
	private boolean mercanciaPeligrosa;

	public AvionDeMercancias(int id, double longitud, double lCombustible, boolean mercanciaPeligrosa) {
		super(id, longitud, lCombustible);
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	@Override
	public String toString() {
		return super.toString()+"AvionDeMercancias [mercanciaPeligrosa=" + mercanciaPeligrosa + "]";
	}
	
	public double calcularPrecioAterrizaje(double cantPorMetro, double cantExtra, double limiteCombustible, 
			double cantPorPasajero, double extraPeligrosas) {
		// TODO Auto-generated method stub
		double total=0;
		
		if(mercanciaPeligrosa==true) {
			
			total=extraPeligrosas	+ super.calcularPrecioAterrizaje(cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, extraPeligrosas);
			
		}else {
			
			total=super.calcularPrecioAterrizaje(cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, extraPeligrosas);
			
		}	
		
		return total;
	}
	
	public void avisarBomberos() {
		if(mercanciaPeligrosa==true) {
			System.out.println("AVISO A LOS BOMBEROS, MERCANCÍA PELIGROSA");
		}
	}

}
