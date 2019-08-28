package dominio;

import excepciones.ExceptionCantidadDigitos;
import excepciones.ExceptionNulo;

public class Pasajero {

	private Integer idPasajero;
	private String apellido;
	private String nombre;
	private String CUIL;
	
	public Pasajero(Integer idPasajero, String CUIL, String apellido, String nombre, String telefono) {
		
		this.idPasajero = idPasajero;
		this.apellido = apellido;
		this.nombre = nombre;
		this.CUIL = CUIL;
		
		
	}
	
	
	public static Pasajero factoryPasajero(Integer idPasajero, String CUIL ,String apellido, String nombre, String telefono) throws ExceptionNulo, ExceptionCantidadDigitos{
		
		if(idPasajero == null || CUIL == null || CUIL == "" || apellido == null || apellido == "" ||
				nombre == null || nombre == "" || telefono == null || telefono == "") {
			
			throw new ExceptionNulo("Error en atributo de la clase Pasajero");
		}
		
		if(CUIL.length() != 10) {
			
			throw new ExceptionCantidadDigitos("El numero de digitos del CUIL es incorrecto");
			
		}
		
		
		return new Pasajero(idPasajero, CUIL, apellido, nombre, telefono);
	}
	
	
	
	
}
