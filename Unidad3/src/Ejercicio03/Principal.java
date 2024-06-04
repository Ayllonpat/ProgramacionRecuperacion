package Ejercicio03;

import java.util.Scanner;

public class Principal {
	
	/*
	 *  Crear un programa que genere números aleatorios mediante métodos en una clase llamada Aleatorios. En el main se
		darán varias opciones en un menú según los rangos entre los que se quieran generar los números. Estos rangos son: entre
		0 y 10, entre 1 y 6 (un dado), entre 1 y 1000 y entre 1 y 49 (sorteo de la primitiva). Se leerán los datos necesarios y se
		llamará a los métodos.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion;
		
		Aleatorios a=new Aleatorios();
		
		System.out.printf("""
				\tBIENVENIDO AL PROGRAMA
				------------------------------------------------
				""");
		
		do {
			System.out.println("""			
					 \nElija una opción de números aleatorios:
					 
					  1.Entre 0 y 10
					  2.Un dado
					  3.Entre 1 y 1000
					  4.Primitiva
					  0.Salir
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion){
				case 1:
					System.out.println(a.generarEntre0a10());
					break;
				case 2:
					System.out.println(a.generarDado());
					break;
				case 3:
					System.out.println(a.generarEntre1a1000());
					break;
				case 4:
					System.out.println(a.generarPrimitiva());
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
