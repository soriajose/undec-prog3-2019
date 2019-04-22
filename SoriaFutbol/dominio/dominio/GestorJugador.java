package dominio;

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


	public int getCantidadJugadores(List<Jugador> aux) {
		
		
		return aux.size();
	}
	

	
	
}
