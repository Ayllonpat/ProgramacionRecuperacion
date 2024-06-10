package examen;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int tam=6;
		int opcion=0;
		double precioMin=0.5; 
		double limiteFurgo=4;
		double limiteCmCubMotos=250;
		double cantPorMetro=1;
		double numDiv=2;
		double sumaNavidad=20;
		String aux;
		String matricula;
		
		Vehiculo v1=new Furgonetas(120, "1111AAA", 5.5);
		Vehiculo v2=new Furgonetas(75, "2222BBB", 3.4);
		Vehiculo v3=new Furgonetas(140, "3333CCC", 8.5);
		Vehiculo v4=new Motos(180, "4444DDD", 230);
		Vehiculo v5=new Motos(85, "5555EEE", 260);
		Vehiculo v6=new Vehiculo(35, "6666FFF");
		
		//Sería bueno pedir el tamaño al usuario
		
		Vehiculo []lista=new Vehiculo[tam];
		Parking p=new Parking("Calle Vigen de Fátima", lista);
		//Esto solo se hace así para evitar tener que hacerlo uno por uno
		
		lista[0]=v1;
		lista[1]=v2;
		lista[2]=v3;
		lista[3]=v4;
		lista[4]=v5;
		lista[5]=v6;
		//Los sysos de los precios deberían usar printf, para poner solo dos decimales.
		
		do {
			System.out.println("""
					-----------------------------------------------------
					Bienvenid@ al Parking
					-----------------------------------------------------
					Seleccione una opción:
					
						1.Mostrar lista
						2.Calcular precio del vehiculo deseado
						3.Calcular recaudado con las motos
						4.Calcular precio Navidad """);
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion){
			case 1:
				p.mostrarLista();
				break;
			case 2:
				System.out.println("Indique la matrícula del vehiculo deseado:");
				matricula=sc.nextLine();
				System.out.println(p.calcularPrecio(matricula, precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv));
				
				break;
			case 3:
				System.out.println(p.calcularPrecioMotos(precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv));
				break;
			case 4:
				System.out.println("Indique la matrícula del vehiculo deseado:");
				matricula=sc.nextLine();
				//Falta el syso para imprimir el precio
				p.calcularPrecioNavidad(matricula, precioMin, limiteFurgo, limiteCmCubMotos, cantPorMetro, numDiv, sumaNavidad);
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("OPCIÓN NO DISPONIBLE");
				break;
			}
		}while(opcion!=0);
		
		System.out.println("""
				-----------------------------------------------------
				Gracias por su atención :)
				-----------------------------------------------------
				""");

	}

}
