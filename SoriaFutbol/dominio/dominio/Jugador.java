package dominio;

import dominio.excepciones.ExceptionPersona;

public class Jugador extends Persona implements Comparable<Jugador>{
	
	private Puesto miPuesto;
	
	public Jugador(String apellidoYNombre, String dni, Puesto p) throws ExceptionPersona {
		
		super(apellidoYNombre, dni);
		
		this.miPuesto = p;
		
	}
	
	public Puesto getMiPuesto() {
		
		return miPuesto;
		
	}

	@Override
	public int compareTo(Jugador j) {
		
		return this.getApellidoYNombre().compareTo(j.getApellidoYNombre());
	}
	

}
