package dominio;

import excepciones.ExceptionNulo;

public class Ciudad {

	private Integer idCiudad;
	private String nombre;
	private String codigoPosta;
	
	
	public Ciudad(Integer idCiudad, String nombre, String codigoPostal) {
		
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.codigoPosta = codigoPostal;
		
	}

	public static Ciudad factoryCiudad(Integer idCiudad, String nombre, String codigoPostal) throws ExceptionNulo {
		
		if(idCiudad == null || nombre == "" || nombre == null || codigoPostal == "" || codigoPostal == null) {
			
			throw new ExceptionNulo("Error en atributo de la clase Ciudad");
			
		}
		
		return new Ciudad(idCiudad, nombre, codigoPostal);
	}
	
	
	
	
	
	
	
}
