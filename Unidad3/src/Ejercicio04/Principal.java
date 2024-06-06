package Ejercicio04;

import java.util.Scanner;

public class Principal {
	
	/*
	 * Realizar una aplicación que opere con números racionales, es decir, fracciones. Se harán las operaciones básicas, sumar,
		restar, multiplicar y dividir dos racionales mediante métodos.
		Se pueden hacer pasando como argumento varios enteros leídos por teclado, el numerador y el denominador de cada
		número e impriman el resultado en pantalla a modo de fracción, por ejemplo, 2/3. Se puede realizar con un método
		específico “imprimirFraccion”.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion;
		int num;
		int dem;
		
		Fraccion f=new Fraccion();
		
		System.out.printf("""
				\tBIENVENIDO AL PROGRAMA
				------------------------------------------------
				""");
		
		do {
			
			System.out.println("Escriba el numerador de la primera fracción:");
				aux=sc.nextLine();
				num=Integer.parseInt(aux);
			System.out.println("Escriba el denominador de la primera fracción:");
				aux=sc.nextLine();
				dem=Integer.parseInt(aux);
			
			Fraccion a=new Fraccion(num, dem);
				
			System.out.println("Escriba el numerador de la segunda fracción:");
				aux=sc.nextLine();
				num=Integer.parseInt(aux);
			System.out.println("Escriba el denominador de la segunda fracción:");
				aux=sc.nextLine();
				dem=Integer.parseInt(aux);
			
			Fraccion b=new Fraccion(num, dem);
			
			System.out.println("""			
					 \nElija la operación a realizar:
					 
					  1.Sumar
					  2.Restar
					  3.Multiplicar
					  4.Dividir
					  0.Salir
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion){
				case 1:
					f.sumarFracciones(a, b);
					f.imprimirFracciones();
						
					break;
				case 2:
					f.restarFracciones(a, b);
					f.imprimirFracciones();
					break;
				case 3:
					f.multiplicarFracciones(a, b);
					f.imprimirFracciones();
					break;
				case 4:
					System.out.println();
					break;
				case 0:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("OPCIÓN NO DISPONIBLE");
					break;
			}
			
		}while(opcion!=0);
		
		System.out.println("Gracias por su atención");

	}

}
