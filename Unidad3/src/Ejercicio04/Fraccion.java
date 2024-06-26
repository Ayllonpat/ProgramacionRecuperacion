package Ejercicio04;

public class Fraccion {
	
	private int num;
	private int dem;
	
	public Fraccion(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDem() {
		return dem;
	}

	public void setDem(int dem) {
		this.dem = dem;
	}
	
	@Override
	public String toString() {
		return "Fraccion [num=" + num + ", dem=" + dem + "]";
	}
	
	public Fraccion() {
		super();
	}	
	
	public Fraccion sumarFracciones(Fraccion a, Fraccion b) {
		Fraccion c=new Fraccion(num, dem);
		num=a.num*b.dem+a.dem*b.num;
		dem=a.dem*b.dem;	
		return c;
	}
	
	public Fraccion restarFracciones(Fraccion a, Fraccion b) {
		Fraccion c=new Fraccion(num, dem);
		num=a.num*b.dem-b.num*a.dem;
	    dem=a.dem*b.dem;
		return c;
	}
	
	public Fraccion multiplicarFracciones(Fraccion a, Fraccion b) {
		Fraccion c=new Fraccion(num, dem);
		num=a.num*b.num;
	    dem=a.dem*b.dem;
		return c;
	}
	
	public Fraccion dividirFracciones(Fraccion a, Fraccion b) {
		Fraccion c=new Fraccion(num, dem);
		return c;
	}
	
	public void imprimirFracciones() {
		System.out.println(num+"/"+dem);
	}
	
}
