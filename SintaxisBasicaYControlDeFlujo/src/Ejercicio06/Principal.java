package Ejercicio06;

import java.util.Scanner;

public class Principal {
	
	//Realizar lo mismo que en el ejercicio anterior, pero diciendo si el número es par o impar.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double num;
		
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println("--------------------------------------");
		
		do {
			
			System.out.println("Escriba un número para saber si es par o impar, 0 para salir:");
			aux=sc.nextLine();
			num=Double.parseDouble(aux);
			
			if(num%2==0) {
				System.out.println("El número es par");
			}else{
				System.out.println("El número es impar");
			}
			
		}while(num!=0);
		
		System.out.println("Gracias por su atención");
	}

}
