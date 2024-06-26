package Ejercicio07;

import java.util.Scanner;

public class Principal {
	
	
	/*
	 * Realizar un programa para un almacén. En este, si se compran más de 100 unidades de un mismo tipo se hace un 40 %
		de descuento, entre 25 y 100 unidades un 20 %, entre 10 y 24 un 10 % y no hay descuento si son menos de 10 unidades.
		Se pide calcular el importe a pagar. Se debe mostrar en pantalla, la cantidad comprada, el precio por unidad, el descuento
		y el precio total.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int cantP=0;
		double porcentaje = 0;
		String aux;
		double precioUnidad=7.5;
		double total;
		double totalFinal;
		double cien=100;
		
		System.out.println("BIENVENIDO AL ALMACÉN");
		System.out.println("----------------------------------");
		
		do {
			
			System.out.println("Indique el número de unidades que desea comprar, 0 para salir:");
			aux=sc.nextLine();
			cantP=Integer.parseInt(aux);
			
			if(cantP<10) {
				porcentaje=0;
			}else if(cantP>=10&&cantP<=24) {
				porcentaje=10;
			}else if(cantP>=25&&cantP<100) {
				porcentaje=20;
			}else if(cantP>100) {
				porcentaje=40;
			}
			
			total=cantP*precioUnidad;
			totalFinal=total-(total*(porcentaje/cien));
			
			System.out.println("\tTICKET");
			System.out.println("-----------------------------------\n");
			System.out.println(" Cantidad Producto\t"+cantP);
			System.out.println(" Precio Unidad    \t"+precioUnidad);
			System.out.println(" Descuento        \t"+porcentaje+"%");
			System.out.println(" Total            \t"+total);
			System.out.println(" Total Final      \t"+totalFinal);
			System.out.println();
			
		}while(cantP!=0);
		
		System.out.println("Gracias por su atención");
		
	}

}
