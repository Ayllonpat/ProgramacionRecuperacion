package Ejercicio06;

public class Cuenta {
	
	private String nombreTitular;
	private String dni;
	private int nCuenta;
	private double saldo;
	private double tipoInteres;
	
	public Cuenta(String nombreTitular, String dni, int nCuenta, double saldo, double tipoInteres) {
		super();
		this.nombreTitular = nombreTitular;
		this.dni = dni;
		this.nCuenta = nCuenta;
		this.saldo = saldo;
		this.tipoInteres = tipoInteres;
	}
	
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getnCuenta() {
		return nCuenta;
	}
	public void setnCuenta(int nCuenta) {
		this.nCuenta = nCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTipoInteres() {
		return tipoInteres;
	}
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	@Override
	public String toString() {
		return "Cuenta [nombreTitular=" + nombreTitular + ", dni=" + dni + ", nCuenta=" + nCuenta + ", saldo=" + saldo
				+ ", tipoInteres=" + tipoInteres + "]";
	}
	
	public void verSaldo() {
		System.out.println(saldo);
	}

	
	

}
