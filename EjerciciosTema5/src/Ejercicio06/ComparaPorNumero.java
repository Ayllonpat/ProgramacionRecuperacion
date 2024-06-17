package Ejercicio06;

import java.util.Comparator;

public class ComparaPorNumero implements Comparator<Jugador>{
	
	public int compare(Jugador j1, Jugador j2) {
		
		return Double.compare(j1.getnCamiseta(), j2.getnCamiseta());
	}
	
}
