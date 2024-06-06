package Ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio01 {
	
	Random rnd=new Random(System.nanoTime());
	List<Integer>tresNumeros=new ArrayList<Integer>();
	
	int desde;
	int hasta;
	int num;
	
	public int generarEntre0a10() {
		desde=0;
		hasta=10;
		return num= rnd.nextInt(hasta-desde)+desde;
	}
	

}
