package Ejercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	/*
	 * Vamos a crear un programa que nos ayude para gestionar un equipo de fútbol. Para ello, se deben crear tres clases, una
		llamada Jugador, otra Equipo y una Principal de prueba. Dependiendo de la forma que uséis para ordenar, puede que haga
		falta otra clase más.
		Los Jugadores están caracterizados por: Nombre, posición (Un string. Pueden ser central, lateral derecho, delantero
		centro...) y el número de la camiseta.
		Nuestra clase Equipo se caracteriza por una lista de jugadores, siendo la colección usada para almacenarlos un ArrayList.
		En ella, se debe poder hacer lo siguiente:
		• Añadir un nuevo jugador.
		• Borrar un jugador de la lista buscando antes al mismo.
		• Imprimir todos los datos de todos los jugadores de la lista usando un iterator.
		• Buscar un jugador por nombre.
		• Buscar todos los jugadores que tengan la misma posición, por ejemplo, todos los centrales.
		• Modificar la posición en que juega un jugador buscando antes al mismo.
		• Ordenar la lista por posiciones de juego.
		Se puede usar, si se quiere, un método que cargue la lista con varios jugadores de prueba para no tener que leerlos por
		teclado.
		Crear un menú en la clase principal donde se pueda comprobar toda la funcionalidad del programa.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int nCamisetaBuscar;
		int nCamisteNuevo;
		String nombreNuevo;
		String posicionNueva;
		int opcion=0;
		String aux;
		
		List<Jugador> listaJugadores=new ArrayList<Jugador>();
		
		listaJugadores.add(new Jugador("Maria", "Delantero", 1));
		listaJugadores.add(new Jugador("David", "Portero", 4));
		listaJugadores.add(new Jugador("Ángel", "Delantero", 3));
		
		Equipo e=new Equipo(listaJugadores);
		
		System.out.println("Bienvenido al programa:");
		
		do {
			
			System.out.println("""
					Elija una opción:
						
						1.Añadir un jugador
						2.Borrar jugador buscando por nCamiseta
						3.Imprimir lista jugadores
						4.Buscar jugador por nombre
						5.Busacar por posicion
						6.Modificar posicion del jugador buscando por nCamiseta
						7.Ordenar lista por posición
						8.Ordenar pornCamiseta
						0.Salir
						
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion){
			
			case 1:
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			case 6:
				break;
				
			case 7:
				e.ordenarListaPorPosicion();
				System.out.println(listaJugadores);
				
				break;
				
			case 8:
				e.ordenarPorNumero();
				System.out.println(listaJugadores);
				break;
			
			case 0:
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Opción no disponible");
				break;
				
			}
			
		}while(opcion!=0);

	}

}
