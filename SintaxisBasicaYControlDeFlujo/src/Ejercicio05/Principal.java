package Ejercicio05;

import java.util.Scanner;

public class Principal {
	
	// Indicar si un número leído por teclado es positivo o negativo. El proceso se repetirá hasta que se introduzca un cero
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double num;
		
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println("--------------------------------------");
		
		do {
			
			System.out.println("Escriba un número para saber si es negativo o positivo, 0 para salir:");
			aux=sc.nextLine();
			num=Double.parseDouble(aux);
			
			if(num>0) {
				System.out.println("El número es positivo");
			}else if(num<0) {
				System.out.println("El número es negativo");
			}
			
		}while(num!=0);
		
		System.out.println("Gracias por su atención");
	}

}
