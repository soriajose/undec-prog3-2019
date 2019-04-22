package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dominio.excepciones.ExceptionPersona;

public class Equipo {
	
	private List<Jugador> misJugadores = new ArrayList<Jugador>();
	private final String nombre;
	private final int MAX_CANTIDAD_JUGADORES;
	
	
	public Equipo (String pNombre) {
		
		this.nombre = pNombre;
		this.MAX_CANTIDAD_JUGADORES = 6;
		misJugadores = new ArrayList<Jugador>();
	}
	

	public Equipo () {
		
		this("SIN NOMBRE");
	}
	
	
	public String getNombre() {
		
		if(nombre.length() > 12) {
			return nombre.substring(0, 12);
		}else {
			
			return nombre.toUpperCase();
		}
		
	}
	
	public List<Jugador> getMisJugadores() {
		
		Collections.sort(misJugadores);
		
		return misJugadores;
	}
	
	public int getCantidadDeJugadores() {
		
		return misJugadores.size();
		
	}
	
	
	public boolean addJugador(String nombre, String dni, Puesto p) throws ExceptionPersona {
		
		Jugador j = new Jugador(nombre, dni, p);
		
		if(!jugadorRepetido(j) && getCantidadDeJugadores() < MAX_CANTIDAD_JUGADORES) {
			
			misJugadores.add(j);
			return true;
		}
		
		return false;
		
	}
	
	public List<Jugador> getJugadores(Puesto p) {
		
		 List<Jugador> puestoJugador = new ArrayList<Jugador>();
		
		for (Jugador jugador : misJugadores) {
			if(jugador.getMiPuesto().equals(p)) {
				
				puestoJugador.add(jugador);
			}
		}
		
		Collections.sort(puestoJugador);
		
		return puestoJugador;
	}
	
	
	public List<Jugador> getJugadores(String parteDelNombre) {
		
		List<Jugador> jugadorNombre = new ArrayList<Jugador>();
		
		
		for (Jugador jugador : misJugadores) {
			
			if(jugador.getApellidoYNombre().contains(parteDelNombre)) {
				
				 jugadorNombre.add(jugador);
			}
		}
		
		Collections.sort(jugadorNombre);
		
		return jugadorNombre;
		
	}

	@Override
	public String toString() {
		
		
		return "Resumen Equipo: " + cantidadArquero() + " Arqueros" + " - " + cantidadDefensor() + " Defensores" + " - " + cantidadDelantero() + " Delanteros";
		
	}
	
	
	public boolean jugadorRepetido(Jugador j) {
		

		for (Jugador jugador : misJugadores) {
			
			if(jugador.getApellidoYNombre().compareToIgnoreCase(j.getApellidoYNombre()) == 0) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public int cantidadArquero() {
		
		int cantidad = 0;
		
		for (Jugador jugador : misJugadores) {
			
			if(jugador.getMiPuesto().equals(Puesto.ARQUERO)){
				
					++cantidad;
			}
		}
		
		return cantidad;
		
	}
	
	public int cantidadDefensor() {
		
		int cantidad = 0;
		
		for (Jugador jugador : misJugadores) {
			
			if(jugador.getMiPuesto().equals(Puesto.DEFENSOR)){
				
					++cantidad;
			}
		}
		
		return cantidad;
		
	
	}

	public int cantidadDelantero() {
	
	int cantidad = 0;
	
	for (Jugador jugador : misJugadores) {
		
		if(jugador.getMiPuesto().equals(Puesto.DELANTERO)){
			
				++cantidad;
		}
	}
	
		return cantidad;
	
	}
	
}
