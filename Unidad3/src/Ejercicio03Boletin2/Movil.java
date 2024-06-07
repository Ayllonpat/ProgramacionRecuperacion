package Ejercicio03Boletin2;

public class Movil {
	
	private String marca;
	private String modelo;
	private boolean vendido;
	private boolean nuevo;
	private double precio;
	
	public Movil(String marca, String modelo, boolean vendido, boolean nuevo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.nuevo = nuevo;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isVendido() {
		return vendido;
	}
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	public boolean isNuevo() {
		return nuevo;
	}
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", vendido=" + vendido + ", nuevo=" + nuevo
				+ ", precio=" + precio + "]";
	}
	
	public double calcularPrecioFinal() {
		double descuentoSM=40;
		double cien=100;
		if(nuevo==false) {
			return precio-precio*(descuentoSM/cien);
		}else {
			return precio;
		}
	}

}
