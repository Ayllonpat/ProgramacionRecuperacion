package Ejercicio04;

public class Fraccion {
	
	int num;
	int dem;
	
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
		num=a.getNum()*b.getDem()+a.getDem()*b.getNum();
		dem=a.getDem()*b.getDem();	
		return c;
	}
	
	public Fraccion restarFracciones(Fraccion a, Fraccion b) {
		Fraccion c=new Fraccion(num, dem);
		num=a.getNum()*b.getDem()-b.getNum()*a.getDem();
	    dem=a.getDem()*b.getDem();
		return c;
	}
	
	public Fraccion multiplicarFracciones(Fraccion a, Fraccion b) {
		Fraccion c=new Fraccion(num, dem);
		num=a.getNum()*b.getNum();
	    dem=a.getDem()*b.getDem();
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
