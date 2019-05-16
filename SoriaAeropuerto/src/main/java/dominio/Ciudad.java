package dominio;

import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

public class Ciudad {
	
	private Integer ciudad; 
	private String nombre;
	private String codigoPostal;
	
	public Ciudad(Integer ciudad, String nombre, String codigoPostal) throws ExceptionNulo, ExceptionVacio{
		
		if(ciudad == null) {
			
			throw new ExceptionNulo("El ID de la ciudad no puede ser nulo");
			
		}
		
		if(nombre == null) {
			
			throw new ExceptionNulo("El nombre de la ciudad no puede ser nulo");
			
		}
		
		if(codigoPostal == null) {
			
			throw new ExceptionNulo("El codigo postal no puede ser nulo");
			
		}
		
		
		if(nombre.equals("")) {
			
			throw new ExceptionVacio("El nombre de la ciudad no puede ser vacio");
			
		}
		
		if(codigoPostal.equals("")) {
			
			throw new ExceptionVacio("El codigo postal no puede ser vacio");
			
		}
		
		this.ciudad = ciudad;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		
		
	}

	public Integer getCiudad() {
		return ciudad;
	}

	public void setCiudad(Integer ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
	
	
	
	
	
}
