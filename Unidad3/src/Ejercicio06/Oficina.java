package Ejercicio06;

public class Oficina {
	
	private Cuenta cuenta;

	public Oficina(Cuenta cuenta) {
		super();
		this.cuenta = cuenta;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Oficina [cuenta=" + cuenta + "]";
	}
	
	public double retirarDinero(Cuenta c, double dineroOp) {
		double saldo=c.getSaldo();
		if(dineroOp>saldo) {
			return -1;
		
		}else {
			saldo=saldo-dineroOp;
			return saldo;
		}
	}
	
	public double ingresarDinero(Cuenta c, double dineroOp) {
		double saldo=c.getSaldo();
		if(dineroOp<0) {
			return -1;
		}else {
			saldo=saldo+dineroOp;
			return saldo;
		}
	}
	
	public double calcularInteres(Cuenta c) {
		double cien=100;
		double saldo=c.getSaldo();
		double tipoInteres=c.getTipoInteres();
		saldo=saldo+saldo*(tipoInteres/cien);
		return saldo;
	}
	
	public double cambiarADolares(Cuenta c, double dolares) {
		double saldoDolares;
		double saldo=c.getSaldo();
		saldoDolares=saldo*dolares;
		return saldoDolares;
	}

}
