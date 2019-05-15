package dominio;

import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

public class Aerolinea {
	
	private Integer iDAerolinea;
	private String nombre;
	
	public Aerolinea (Integer iDAerolinea, String nombre) throws ExceptionNulo, ExceptionVacio {
		
		if(iDAerolinea == null) {
			
			throw new ExceptionNulo("El ID de la Aerolinea no puede ser nulo");
		}
		
		if(nombre == null) {
			
			throw new ExceptionNulo("El nombre del Aeropuerto no puede ser nulo");
		}
		
		if(nombre == "") {
			
			throw new ExceptionVacio("El nombre del Aeropuerto no puede ser vacio");
		}
		
		
		this.iDAerolinea = iDAerolinea;
		this.nombre = nombre;
		
		
	}
	
	
	public String getResumenAerolinea() {
		
		
		
		return "ID Aerolina: " + this.iDAerolinea + " - Nombre: " + this.nombre;
		
	}
	
	
	
}
