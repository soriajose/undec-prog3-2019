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
	
	public Pasajero(Integer idPasajero, String CUIL, String apellido, String nombre, String telefono) throws ExceptionNulo, ExceptionVacio, ExceptionCantidadIncorrecta {
		
		if(idPasajero == null) {
			
			throw new ExceptionNulo("El ID no puede ser nulo");
		}
		
		if(CUIL == null) {
			
			throw new ExceptionNulo("El CUIL no puede ser nulo");
		}
	
		if(CUIL == "") {
			
			throw new ExceptionVacio("El CUIL no puede ser vacio");
		}

		if(apellido == null) {
			
			
			throw new ExceptionNulo("El apellido no puede ser nulo");
		}
		
		if(apellido == "") {
			
			
			throw new ExceptionVacio("El apellido no puede ser nulo");
		}
		
		if(nombre == null) {
			
			
			throw new ExceptionNulo("El nombre no puede ser nulo");
		}
		
		if(nombre == "") {
	
	
			throw new ExceptionVacio("El nombre no puede ser vacio");
		}
		
		

		if(CUIL.length() != 10 || CUIL.length() != 11) {
			
			throw new ExceptionCantidadIncorrecta("La cantidad es dinstinta a 10 y 11");
			
		}
		
		
		this.idPasajero = idPasajero;
		this.CUIL = CUIL;
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
		
	}

	
	public String getCUILFormato() throws ExceptionNulo, ExceptionVacio, ExceptionCantidadIncorrecta{
		
		if(this.CUIL.length() != 10 || this.CUIL.length() != 11) {
			
			throw new ExceptionCantidadIncorrecta("La cantidad es dinstinta a 10 y 11");
			
		}
		
		if(this.CUIL.length() == 10) {
			
			
			return this.CUIL.substring(0, 2) + "-" + this.CUIL.substring(2, 3) + "." + this.CUIL.substring(3, 6) + "." + this.CUIL.substring(6, 9) + "-" + this.CUIL.substring(9, 10);
		}
		
		
		return this.CUIL.substring(0, 2) + "-" + this.CUIL.substring(2, 4) + "." + this.CUIL.substring(4, 7) + "." + this.CUIL.substring(7, 10) + "-" + this.CUIL.substring(10, 11);
	
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
