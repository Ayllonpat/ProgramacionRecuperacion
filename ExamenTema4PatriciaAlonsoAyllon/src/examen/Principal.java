package examen;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		double cantPorMetro=0;
		double cantExtra=0;
		double limiteCombustible=20000;
		double cantPorPasajero=0;
		double extraPeligrosas=0;
		int tam = 5;
		int opcion=0;
		String aux;
		
		Avion a1=new Avion(1, 40.5, 15000);
		Avion a2=new AvionDePasajeros(2, 35, 19000, 234);
		Avion a3=new AvionDePasajeros(3, 41, 21000, 256);
		Avion a4=new AvionDeMercancias(4, 20, 18000, false);
		Avion a5=new AvionDeMercancias(5, 30, 23000, true);
		
		Avion listaAviones[]= new Avion[tam];
		
		listaAviones[0]=a1;
		listaAviones[1]=a2;
		listaAviones[2]=a3;
		listaAviones[3]=a4;
		listaAviones[4]=a5;
		
		Aeropuerto ap=new Aeropuerto("Barajas", listaAviones);
		
		System.out.println("""
				\tBIENVENIDO AL PROGRAMA
				----------------------------------------------------
				""");
		do {
			
			System.out.println("""
					\nElija una opción:
					
						1.Mostrar todos los aviones
						2.Calcular aterrizaje de un avión a1
						3.Calcular total recaudado aviones de pasajeros
						4.Calcular total recaudado todos los aviones
						5.Calcular media recaudado aviones de mercancias
						0.Salir
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
					
				case 1:
					System.out.println("----------------------------------------------------");
					ap.mostrarListado();
					
					break;
					
				case 2:
					System.out.println("----------------------------------------------------");
					
					System.out.println("Indique la cantidad que desea cobrar por metro:");
					aux=sc.nextLine();
					cantPorMetro=Double.parseDouble(aux);
					
					System.out.println("Indique la cantidad extra que desea cobrar si se pasa del limite de 20000l:");
					aux=sc.nextLine();
					cantExtra=Double.parseDouble(aux);
					
					System.out.println(ap.calcularAterrizajeUnAvion(a1, cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, extraPeligrosas)+"€");
					
					break;
					
				case 3:
					
					System.out.println("----------------------------------------------------");
					
					System.out.println("Indique la cantidad que desea cobrar por metro:");
					aux=sc.nextLine();
					cantPorMetro=Double.parseDouble(aux);
					
					System.out.println("Indique la cantidad extra que desea cobrar si se pasa del limite de 20000l:");
					aux=sc.nextLine();
					cantExtra=Double.parseDouble(aux);
					
					System.out.println("Indique la cantidad que desea cobrar por pasajero:");
					aux=sc.nextLine();
					cantPorPasajero=Double.parseDouble(aux);
					
					System.out.println(ap.calcularTotalRecaudadoSoloPasajeros(cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, extraPeligrosas)+"€");	
					
					break;
					
				case 4:
					
					System.out.println("----------------------------------------------------");
					
					System.out.println("Indique la cantidad que desea cobrar por metro:");
					aux=sc.nextLine();
					cantPorMetro=Double.parseDouble(aux);
					
					System.out.println("Indique la cantidad extra que desea cobrar si se pasa del limite de 20000l:");
					aux=sc.nextLine();
					cantExtra=Double.parseDouble(aux);
					
					System.out.println("Indique la cantidad que desea cobrar por pasajero:");
					aux=sc.nextLine();
					cantPorPasajero=Double.parseDouble(aux);
					
					System.out.println("Indique la cantidad que desea cobrar por si lleva mercancia peligrosa:");
					aux=sc.nextLine();
					extraPeligrosas=Double.parseDouble(aux);
					
					
					System.out.println(ap.calcularTotalRecaudado(cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, extraPeligrosas)+"€");	
					
					break;
					
				case 5:
					System.out.println("----------------------------------------------------");
					
					System.out.println("Indique la cantidad que desea cobrar por metro:");
					aux=sc.nextLine();
					cantPorMetro=Double.parseDouble(aux);
					
					System.out.println("Indique la cantidad extra que desea cobrar si se pasa del limite de 20000l:");
					aux=sc.nextLine();
					cantExtra=Double.parseDouble(aux);
					
					System.out.println("Indique la cantidad que desea cobrar por si lleva mercancia peligrosa:");
					aux=sc.nextLine();
					extraPeligrosas=Double.parseDouble(aux);
					
					System.out.println(ap.calcularMediaMercancias(cantPorMetro, cantExtra, limiteCombustible, cantPorPasajero, extraPeligrosas)+"€");	
					
					break;
					
				default:
					
					System.out.println("----------------------------------------------------");
					
					System.out.println("OPCIÓN NO DISPONIBLE");
					
					break;
			
			}
			
		}while(opcion!=0);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Gracias por su atención");
		
	}

}
