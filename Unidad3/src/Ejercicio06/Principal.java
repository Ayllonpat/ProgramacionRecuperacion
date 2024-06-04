package Ejercicio06;

import java.util.Scanner;

public class Principal {
	/*
	 *  Se pide un programa para gestionar nuestra cuenta de banco. De momento, usaremos tan solo la clase Cuenta y la clase
		principal. Tendremos como atributos nombre del titular, DNI, número de cuenta, saldo y tipo de interés. El programa
		debe permitir crear un objeto tipo Cuenta (solo es necesaria una cuenta) y tener métodos para:
			• Ver el saldo que nos queda.
			• Calcular el nuevo saldo después de ingresar o retirar dinero.
			• Sacar dinero. Para sacar dinero, si se quiere sacar una cantidad mayor al saldo devolveremos -1 y si es menor el nuevo
			saldo actualizado.
			• Introducir dinero actualizando el saldo y comprobando que la cantidad a introducir no es negativa.
			• Sumar a nuestro saldo, la cantidad generada por los intereses. Esto se calcula, sumando al saldo, un tanto por ciento
			(el interés) del propio saldo pasado como parámetro.
			• Mostrar todos los datos de la cuenta.
			• Cambiar saldo (en euros) a dólares a razón de 1.36 dólares por cada euro.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion;
		double dineroOp;
		double dolares=1.36;
		
		Cuenta c=new Cuenta("Iván", "62525678Z", 1, 1345.45, 0.8);
		
		System.out.printf("""
				\tBIENVENIDO AL PROGRAMA
				------------------------------------------------
				""");
		
		do {
			System.out.println("""			
					 \nElija que desea hacer:
					 
					  1.Ver saldo
					  2.Actualizar saldo
					  3.Sacar dinero
					  4.Introducir dinero
					  5.Añadir interes
					  6.Mostrar todos los datos
					  7.Comprobar saldo en $
					  0.Salir
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion){
				case 1:
					c.verSaldo(c);
					break;
				case 2:
					System.out.println(c.actualizarSaldo(c));
					break;
				case 3:
					System.out.println("Indique el saldo que desea retirar:");
					aux=sc.nextLine();
					dineroOp=Double.parseDouble(aux);
					System.out.println(c.retirarDinero(c, dineroOp));
					//si devuelve -1 la cantidad a sacar es mayor que el saldo y 0 es que estas intentado retirar una cantidad negativa
					break;
				case 4:
					System.out.println("Indique el saldo que desea ingresar:");
					aux=sc.nextLine();
					dineroOp=Double.parseDouble(aux);
					
					System.out.println(c.ingresarDinero(c, dineroOp));
					//si devuelve -1 la cantidad a ingrsar es una cantidad negativa
					break;
				case 5:
					System.out.println(c.calcularInteres(c));
					break;
				case 6:
					c.toString();
					break;
				case 7:
					c.cambiarADolares(c, dolares);
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
