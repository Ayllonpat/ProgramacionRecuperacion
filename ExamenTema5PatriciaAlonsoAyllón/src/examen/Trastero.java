package examen;

public class Trastero implements Comparable<Trastero>{
	
	private double mCuadrados;
	private String direccion;
	private int nTrastero;
	private double precio;
	private boolean ocupado;
	
	public Trastero(double mCuadrados, String direccion, int nTrastero, double precio, boolean ocupado) {
		super();
		this.mCuadrados = mCuadrados;
		this.direccion = direccion;
		this.nTrastero = nTrastero;
		this.precio = precio;
		this.ocupado = ocupado;
	}
	public double getmCuadrados() {
		return mCuadrados;
	}
	public void setmCuadrados(double mCuadrados) {
		this.mCuadrados = mCuadrados;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getnTrastero() {
		return nTrastero;
	}
	public void setnTrastero(int nTrastero) {
		this.nTrastero = nTrastero;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	@Override
	public String toString() {
		return "Trastero [mCuadrados=" + mCuadrados + ", direccion=" + direccion + ", nTrastero=" + nTrastero
				+ ", precio=" + precio + ", ocupado=" + ocupado + "]";
	}
	
	@Override
	public int compareTo(Trastero t) {
		
		if(this.getnTrastero()>t.nTrastero) {
			return 1;
		}else if(t.nTrastero>this.getnTrastero()) {
			return -1;
		}else {		
		return 0;
		}
	}
	
	

}
