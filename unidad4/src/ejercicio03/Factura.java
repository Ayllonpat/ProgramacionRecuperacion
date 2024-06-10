package ejercicio03;

public class Factura extends Documentos{
	
	double total;
	
	public Factura(long id, double total) {
		super(id);
		this.total = total;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return super.toString()+"Factura [ total=" + total + "]";
	}
	
	public void mostrarDatos() {
		
	}

}
