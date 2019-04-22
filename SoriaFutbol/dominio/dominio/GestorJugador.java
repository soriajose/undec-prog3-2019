package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorJugador {

	private static GestorJugador miGestorJugador;
	
	public GestorJugador() {
		
	}
	
	
	public static GestorJugador getInstancia() {
		
		if(miGestorJugador == null) {
			
			miGestorJugador = new GestorJugador();
		}
		
		return miGestorJugador;
	}
	
	public List<Jugador> getJugadores(List<Jugador> lista, Puesto p) {
		
		 List<Jugador> puestoJugador = new ArrayList<Jugador>();
		
		for (Jugador jugador : lista) {
			if(jugador.getMiPuesto().equals(p)) {
				
				puestoJugador.add(jugador);
			}
		}
		
		Collections.sort(puestoJugador);
		
		return puestoJugador;
	}
	
	
	
	public int getCantidadJugadores(List<Jugador> aux) {
				
		return aux.size();
	}
	

	
	
}
