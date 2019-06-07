package dominio;

import excepciones.ExceptionCantidadIncorrecta;
import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

public class Pasajero {

	private Integer idPasajero;
	private String CUIL;
	private String apellido;
	private String nombre;
	private String telefono;
	
	public Pasajero(Integer idPasajero, String CUIL, String apellido, String nombre, String telefono) throws ExceptionNulo, ExceptionCantidadIncorrecta {
		
		this.idPasajero = idPasajero;
		this.CUIL = CUIL;
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
		
	}

	public static Pasajero factoryPasajero(Integer idPasajero, String CUIL, String apellido, String nombre, String telefono) throws ExceptionNulo, ExceptionCantidadIncorrecta {
		
		if(idPasajero == null || CUIL == null || apellido == null || nombre == null || telefono == null) {
			
			throw new ExceptionNulo("Atributo del pasajero nulo");
		}
		
		if(CUIL.length() < 10 || CUIL.length() > 11) {
			
			throw new ExceptionCantidadIncorrecta("La cantidad es dinstinta a 10 y 11");
			
		}
		
		return new Pasajero(idPasajero, CUIL, apellido, nombre, telefono);
	}	
	
	public String getCUILFormato() throws ExceptionNulo {
		
		
		
		if(this.CUIL.length() == 10) {
			
			
			return "El numero de CUIL es: " + this.CUIL.substring(0, 2) + "-" + this.CUIL.substring(2, 3) + this.CUIL.substring(3, 6) + this.CUIL.substring(6, 9) + "-" + this.CUIL.substring(9, 10);
		}
		
		
		return "El numero de CUIL es: " + this.CUIL.substring(0, 2) + "-" + this.CUIL.substring(2, 4) + this.CUIL.substring(4, 7) + this.CUIL.substring(7, 10) + "-" + this.CUIL.substring(10, 11);
	
	}



	
	
	
	
}
