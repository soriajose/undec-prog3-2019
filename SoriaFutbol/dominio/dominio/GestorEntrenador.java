package dominio;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import dominio.excepciones.ExceptionPersona;

public class GestorEntrenador {

	private static GestorEntrenador miGestor = null;
	
	private List<Entrenador> misEntrenadores ;
	private int MAX_ENTRENADOR = 4;
	
	public GestorEntrenador() {
		misEntrenadores = new ArrayList<Entrenador>();
	}
	

	public static GestorEntrenador getInstancia() {
		
		if(miGestor == null) {
			
			
			miGestor = new GestorEntrenador();
		}
		
		return miGestor;
	}
	
	
	public boolean addEntrenador(String nombre, String dni, Cargo cargo) {
		
		try {
			Entrenador entrenador = new Entrenador(nombre, dni, cargo);
			
			if(!entrenadorRepetido(entrenador) && misEntrenadores.size() < this.MAX_ENTRENADOR) {
				
				if(contieneCargo(Cargo.PRIMERENTRENADOR)) {
					
					return false;
				}
				
				misEntrenadores.add(entrenador);
				return true;
				
			}
			
		} catch (ExceptionPersona e) {
			
			fail("Esta linea no deberia correrse");
		}
		
		
		return true;
	}
	
	
	private boolean contieneCargo(Cargo c) {
		
		for (Entrenador entrenador : misEntrenadores) {
			if(entrenador.getMiCargo().equals(c))
				return true;
		}
		
		return false;
	}
	
	private boolean entrenadorRepetido(Entrenador entrenador) {
		
		for(Entrenador i: misEntrenadores) {
			
			if(i.getApellidoYNombre().equals(entrenador.getApellidoYNombre())) {
				
				return true;
			}
			
		}
		
		
		
		return false;
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
	
	
	public Entrenador devolverEntrenadorPorNombre(String nombre) {
		for (Entrenador entrenador : misEntrenadores) {
			if(entrenador.getApellidoYNombre().equals(nombre))
				return entrenador;
		}
		
		return null;
	}
	
	
	public Cargo devolverCargoPorNombre(String nombre) {
		for (Entrenador entrenador : misEntrenadores) {
			if(entrenador.getApellidoYNombre().equals(nombre))
				return entrenador.getMiCargo();
		}
		
		return null;
	}
	
	
	public List<Entrenador> devolverEntrenadoresPorCargo(Cargo carg) {
		List<Entrenador> salida = new ArrayList<Entrenador>();
		for (Entrenador entrenador : misEntrenadores) {
			if(entrenador.getMiCargo().equals(carg))
				salida.add(entrenador);
		}
		
		return salida;
	}
	
	
}
