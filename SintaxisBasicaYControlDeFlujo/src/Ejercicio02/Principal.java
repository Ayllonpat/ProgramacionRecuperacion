package Ejercicio02;

import java.util.Scanner;

public class Principal {
	
	//Decir qué número es mayor de dos leídos por teclado.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int num1;
		int num2;
		
		System.out.println("Vamos a comparar dos números enteros");
		System.out.println("-----------------------------------------------");
		System.out.println("Escriba el primer número:");
		aux=sc.nextLine();
		num1=Integer.parseInt(aux);
		System.out.println("Escriba el segundo número:");
		aux=sc.nextLine();
		num2=Integer.parseInt(aux);
		
		if(num1>num2) {
			System.out.printf("%d es mayor que %d \n", num1, num2);
		}else if(num1==num2) {
			System.out.println("Ambos números son iguales");
		}else {
			System.out.printf("%d es menor que %d \n", num1, num2);
		}
	}

}
