package Ejercicio04;

import java.util.Scanner;

public class Principal {
	//Realizar el cuadrado de un número positivo introducido por el usuario y repetir el proceso hasta que se introduzca un
	//número negativo, sin tener este último en cuenta.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String aux;
		double num=0;
		double cuadrado;
		
		System.out.println("BIENVENIDO AL PROGRAMA");
		System.out.println("--------------------------------------");
		do {
			
			System.out.println("\nEscriba números positivos para calcular su cuadrado, negativos para salir:");
			aux=sc.nextLine();
			num=Double.parseDouble(aux);
			
			cuadrado=num*num;
			
			if(num>0) {
				System.out.printf("El cuadrado de %.2f es %.2f \n", num, cuadrado);
			}
			
		}while(num>0);
		
		System.out.println("Gracias por su atención");
	}

}