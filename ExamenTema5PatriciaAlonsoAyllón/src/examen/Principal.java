package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		List<Trastero> listaTrasteros=new ArrayList<Trastero>();
		
		Trastero t1= new Trastero(20, "Virgen de Luján", 2, 5000, false);
		Trastero t2= new Trastero(19.5, "Virgen de Fátima", 1, 4678.02, true);
		Trastero t3= new Trastero(32,"Virgen de Luján", 5, 2345, true);
		Trastero t4= new Trastero(11, "Virgen de Fátima", 8, 1342, false);
		
		listaTrasteros.add(t1);
		listaTrasteros.add(t2);
		listaTrasteros.add(t3);
		listaTrasteros.add(t4);
		
		Oficina o=new Oficina(listaTrasteros);
		
		String aux;
		int opcion=0;
		double nuevoTamanio;
		String nuevaDirección;
		int nuevoNum;
		double nuevoPrecio;
		boolean nuevoEstado;
		double precio;
		String calle;
		int numBuscado;
		
		System.out.println("""
				Bienvenidos al prgrama
				-----------------------
				""");
		
		do {
			
			System.out.println("""
					Elija una opción:
					
						1.Añadir un nuevo trastero
						2.Mostrar todos los trasteros
						3.Buscar trastero por precio
						4.Buscar los trasteros libres por calle
						5.Buscar trastero con mayor precio
						6.Eliminar trastero
						7.Modificar precio el trastero deseado
						8.Ordenar por nTrastero
						9.Ordenar por precio mayor a menos
					    10.Mostrar los trasteros ocupados
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
			case 1: 
				System.out.println("Indique el tamaño:");
					aux=sc.nextLine();
					nuevoTamanio=Double.parseDouble(aux);
				System.out.println("Indique la nueva dirección:");
				 	nuevaDirección=sc.nextLine();
				System.out.println("Indique el número:");
					aux=sc.nextLine();
					nuevoNum=Integer.parseInt(aux);
				System.out.println("Indique el precio:");
					aux=sc.nextLine();
					nuevoPrecio=Double.parseDouble(aux);
				System.out.println("Escriba true si está ocupado o false sino:");
				 	aux=sc.nextLine();
				 	nuevoEstado=Boolean.parseBoolean(aux);
				 	
				 	Trastero nt= new Trastero(nuevoTamanio, nuevaDirección, nuevoNum, nuevoPrecio, nuevoEstado);
				 	o.agregarNuevoTrastero(nt);
				break;
			case 2: 
				o.mostrarLista();
				break;
			case 3:
				System.out.println("Indique el precio:");
					aux=sc.nextLine();
					precio=Double.parseDouble(aux);
					System.out.println(o.buscarPorPrecio(precio));
				
				break;
			case 4: 
				System.out.println("Indique la calle:");
			 	calle=sc.nextLine();
			 	System.out.println(o.buscarLibrePorCalle(calle));
				break;
			case 5:
				System.out.println(o.buscarPrecioMayor());
				break;
			case 6: 
				System.out.println("Indique el número:");
				aux=sc.nextLine();
				numBuscado=Integer.parseInt(aux);
				o.borrarNum(numBuscado);
				break;
			case 7:
				System.out.println("Indique el número:");
					aux=sc.nextLine();
					numBuscado=Integer.parseInt(aux);
				System.out.println("Indique el precio:");
					aux=sc.nextLine();
					precio=Double.parseDouble(aux);
				o.modificarPrecio(numBuscado, precio);
				break;
			case 8: 
				o.ordenarPorNumero();
				System.out.println(listaTrasteros);
				break;
			case 9:
				break;
			case 10:
				System.out.println(o.buscarOcupado());
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("OPCIÓN NO DISPONIBLE");
				break;
			}
			
		}while(opcion!=0);

	}

}
