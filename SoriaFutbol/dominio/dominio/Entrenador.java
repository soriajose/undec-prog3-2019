package dominio;

import dominio.excepciones.ExceptionPersona;

public class Entrenador extends Persona{

	private Cargo miCargo;
	
	public Entrenador(String apellidoYNombre, String dni, Cargo c)  throws ExceptionPersona{
		
		super(apellidoYNombre, dni);
		
		this.miCargo = c;
	}
	
	
	public Cargo getMiCargo() {
		
		return miCargo;
		
	}
	
	
}
