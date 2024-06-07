package Ejercicio03Boletin2;

import java.util.Arrays;

public class Vendedor {
	
	private Movil[] listaMoviles;
	private double totalVendido;
	private int nMoviles;
	private double dineroBolsillo;
	public Vendedor(Movil[] listaMoviles, double totalVendido, int nMoviles, double dineroBolsillo) {
		super();
		this.listaMoviles = listaMoviles;
		this.totalVendido = totalVendido;
		this.nMoviles = nMoviles;
		this.dineroBolsillo = dineroBolsillo;
	}
	public Movil[] getListaMoviles() {
		return listaMoviles;
	}
	public void setListaMoviles(Movil[] listaMoviles) {
		this.listaMoviles = listaMoviles;
	}
	public double getTotalVendido() {
		return totalVendido;
	}
	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}
	public int getnMoviles() {
		return nMoviles;
	}
	public void setnMoviles(int nMoviles) {
		this.nMoviles = nMoviles;
	}
	public double getDineroBolsillo() {
		return dineroBolsillo;
	}
	public void setDineroBolsillo(double dineroBolsillo) {
		this.dineroBolsillo = dineroBolsillo;
	}
	@Override
	public String toString() {
		return "Vendedor [listaMoviles=" + Arrays.toString(listaMoviles) + ", totalVendido=" + totalVendido
				+ ", nMoviles=" + nMoviles + ", dineroBolsillo=" + dineroBolsillo + "]";
	}
	
	public int comprobarMovilesSinVender() {
		for(int i=0;i < listaMoviles.length;i++) {
			if(!listaMoviles[i].isVendido()) {
				nMoviles++;
			}
		}
		return nMoviles;
	}
	
	public Movil findByModel(String modelo) {
		boolean encontrado = false;
		Movil movilEncontrado=null;
		for(int i=0;i<listaMoviles.length && !encontrado;i++) {
			if(listaMoviles[i].getModelo().equalsIgnoreCase(modelo)) {
				encontrado=true;
				movilEncontrado=listaMoviles[i];
			}
		}
		return movilEncontrado;
	}
	
	public double precioPorProducto(String modelo) {
		return findByModel(modelo).calcularPrecioFinal();		
	}
	
	

}
