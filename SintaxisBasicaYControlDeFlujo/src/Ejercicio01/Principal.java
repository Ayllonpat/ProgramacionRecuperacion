package Ejercicio01;

import java.util.Scanner;

public class Principal {
	
	//Calcular el área de un círculo inicializando el valor de la variable radio al declararla.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double radio;
		double area;		
		
		System.out.println("Indique el radio del circulo del que desea saber el area:");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		
		area=radio*Math.PI;
		
		System.out.printf("El area del circulo es %.2f", area);
	}

}
 