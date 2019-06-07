package dominio;

import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

public class Ciudad {
	
	private Integer idCiudad; 
	private String nombre;
	private String codigoPostal;
	
	public Ciudad(Integer idCiudad, String nombre, String codigoPostal) throws ExceptionNulo {
		
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		
	}

	public static Ciudad factoryCiudad(Integer idCiudad, String nombre, String codigoPostal) throws ExceptionNulo {
			
		if(idCiudad == null || nombre == null || codigoPostal == null) {
			
			throw new ExceptionNulo("Atributo de Ciudad nulo");
		}
		
		return new Ciudad(101, "Chilecito", "5360");
	}
	
	
	
	
	
	
	
}
