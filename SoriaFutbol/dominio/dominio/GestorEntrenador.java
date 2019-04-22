package dominio;

import dominio.excepciones.ExceptionPersona;

public class GestorEntrenador {

	private static GestorEntrenador miGestor;
	
	public GestorEntrenador() {
		
	}
	
	public static GestorEntrenador getInstancia() {
		
		if(miGestor == null) {
			
			
			miGestor = new GestorEntrenador();
		}
		
		return miGestor;
	}
	
	
	public String getMostrarEntrenador(String nombre) {
		
		return "Su nombre completo es: " + nombre;
	}

	public String getMostrarDNI(String dni) {
		
		return "Su DNI es: " + dni;
	}

	public String getMostrarCargo(Cargo miCargo) {
		
		return "Su cargo es: " + miCargo;
	}
	
	
}
