package Ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Equipo{
	
	List <Jugador>listaJugadores;

	public Equipo(List<Jugador> listaJugadores) {
		super();
		this.listaJugadores = listaJugadores;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	@Override
	public String toString() {
		return "Equipo [listaJugadores=" + listaJugadores + "]";
	}
	
	public void agregarJugador(Jugador j) {
		listaJugadores.add(j);
	}
	
	public Jugador buscarJugador(int nCamisetaBuscar) {
		
		Jugador jugadorEncontrado = null;
		
		for (Jugador jugador : listaJugadores) {
			if(jugador.getnCamiseta()==nCamisetaBuscar) {
				jugadorEncontrado=jugador;
			}
		}return jugadorEncontrado;
	}
	
	public void borrarJugador(int nCamisetaBuscar) {
		listaJugadores.remove(buscarJugador(nCamisetaBuscar));
	}
	
	public void imprimirLista() {
		Iterator<Jugador>i=listaJugadores.iterator();
		while(i.hasNext()) {
			Jugador jugador=(Jugador)i.next();
			System.out.println(jugador);
		}
	}
	
	public List<Jugador> buscarPorNombre(String nombreBuscar){
		List<Jugador> lista=new ArrayList<Jugador>();
		for (Jugador jugador : listaJugadores) {
			if(jugador.getNombre().equalsIgnoreCase(nombreBuscar)) {
				lista.add(jugador);
			}
		}
		return lista;
	}
	
	public void ordenarListaPorPosicion() {
		Collections.sort(listaJugadores);
	}
	
	public void ordenarPorNumero() {
		Collections.sort(listaJugadores, new ComparaPorNumero());
	}

}
