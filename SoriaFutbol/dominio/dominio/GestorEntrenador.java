package dominio;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import dominio.excepciones.ExceptionPersona;

public class GestorEntrenador {

	private static GestorEntrenador miGestor;
	
	private List<Entrenador> misEntrenadores = new ArrayList<Entrenador>();
	private int MAX_ENTRENADOR = 4;
	
	public GestorEntrenador() {
		
	}
	
	public boolean addEntrenador(String nombre, String dni, Cargo cargo) {
		
		try {
			Entrenador entrenador = new Entrenador(nombre, dni, cargo);
			
			misEntrenadores.add(entrenador);
			
		} catch (ExceptionPersona e) {
			
			fail("Esta linea no deberia correrse");
		}
		
		
		return true;
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
