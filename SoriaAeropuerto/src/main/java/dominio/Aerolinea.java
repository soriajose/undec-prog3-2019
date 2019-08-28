package dominio;


import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

public class Aerolinea {
	
	private Integer idAerolinea;
	private String nombre;
	
	public Aerolinea(Integer idAerolinea, String nombre) {
		
		this.idAerolinea = idAerolinea;
		this.nombre = nombre;
		
	}
	
	
	public static Aerolinea factoryAerolinea(Integer idAerolinea, String nombre) throws ExceptionNulo{
		
		if(idAerolinea == null || nombre == "" || nombre == null) {
			
			throw new ExceptionNulo("Error en atributo de la clase Aerolinea");
			
		}
		
		
		return new Aerolinea(idAerolinea, nombre);
	}
	

	
	
}
