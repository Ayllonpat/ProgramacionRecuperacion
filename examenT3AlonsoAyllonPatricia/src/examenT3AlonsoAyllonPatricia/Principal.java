package examenT3AlonsoAyllonPatricia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion = 0;
		double cantHE=0;
		double impuestos=0;
		double gastado;
		double nSueldoBase;
		
		Profesor p=new Profesor("Ángel", "Navarro", 1, 1890.07, 32);
		Gestion g=new Gestion(p);
		
		System.out.println("""
				\tBIENVENIDOS AL PROGRAMA			
				""");
		do {
			
			System.out.println("""
					---------------------------------------------
					\nElija una opción:
					
						1.Calcular sueldo bruto
						2.Calcular sueldo neto
						3.Comprobar si el trabajador se ha pasado de horas extras
						4.Calcular ahorro
						5.Modificar sueldo base
						0.Salir
						
					-----------------------------------------------------------
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 1:
					
					System.out.println("Indique cuanto se cobra por hora extra:");
						aux=sc.nextLine();
						cantHE=Double.parseDouble(aux);
						
					System.out.printf("El sueldo en bruto es %.2f", p.calcularSueldoBruto(cantHE));
								
					break;
				case 2:
					
					System.out.println("Indique el porcentaje de los impuestos a aplicar:");
						aux=sc.nextLine();
						impuestos=Double.parseDouble(aux);
					
					System.out.printf("El sueldo en neto es %.2f",g.calcularSueldoNeto(cantHE, impuestos));
					
					break;
				case 3:
					
					g.comprobarHorasExtras();
					g.imprimirMensajeHorasExtras();
					
					break;
				case 4:
					
					System.out.println("Indique cuanto ha gastado este mes:");
						aux=sc.nextLine();
						gastado=Double.parseDouble(aux);
						//g.calcularSueldoNeto(cantHE, impuestos);
					System.out.printf("El dinero ahorrado este mes es %.2f", g.comprobarAhorros(cantHE, impuestos, gastado));
					
					break;
				case 5:
					
					System.out.println("Indique el nuevo sueldo base:");
					
						aux=sc.nextLine();
						nSueldoBase=Double.parseDouble(aux);
					
						g.cambiarSueldoBase(nSueldoBase);
					
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
