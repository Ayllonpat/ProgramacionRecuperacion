package Ejercicio03;

import java.util.Scanner;

public class Principal {
	
	//Pedir una nota del 1 al 10 y mostrar un mensaje diciendo a cuánto equivale mediante palabras, como insuficiente, bien,
	//etc. Usando switch.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int nota=0;
		
		System.out.println("BIENVENIDO AL PROGRAMA:");
		System.out.println("-----------------------------------\n");
		do {
			
			System.out.println("Indique la nota del 1-10, pulse 0 para salir:");
			aux=sc.nextLine();
			nota=Integer.parseInt(aux);
			
			switch(nota){
				case 1:
					System.out.println("Suspenso");
					break;
				case 2:
					System.out.println("Suspenso");
					break;
				case 3:
					System.out.println("Suspenso");
					break;
				case 4:
					System.out.println("Suspenso");
					break;
				case 5:
					System.out.println("Suficiente");
					break;
				case 6:
					System.out.println("Bien");
					break;
				case 7:
					System.out.println("Notable");
					break;
				case 8:
					System.out.println("Notable");
					break;
				case 9:
					System.out.println("Sobresaliente");
					break;
				case 10:
					System.out.println("Sobresaliente");
					break;
				case 0:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("OPCIÓN NO DISPONIBLE");
					break;	
			}
			
		}while(nota!=0);
		
		System.out.println("Gracias por su atención");
		
	}

}
