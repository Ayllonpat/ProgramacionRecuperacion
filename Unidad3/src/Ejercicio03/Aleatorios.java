package Ejercicio03;

import java.util.Random;

public class Aleatorios {
	
	Random rnd=new Random(System.nanoTime());
	
	int desde;
	int hasta;
	int num;
	
	public int generarEntre0a10() {
		desde=0;
		hasta=10;
		return num= rnd.nextInt(hasta-desde)+desde;
	}
	
	public int generarDado() {
		desde=1;
		hasta=6;
		return num= rnd.nextInt(hasta-desde)+desde;
	}
	
	public int generarEntre1a1000() {
		desde=1;
		hasta=1000;
		return num= rnd.nextInt(hasta-desde)+desde;
	}
	
	public int generarPrimitiva() {
		desde=1;
		hasta=49;
		return num= rnd.nextInt(hasta-desde)+desde;
	}

}
