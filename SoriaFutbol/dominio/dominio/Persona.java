package dominio;

import dominio.excepciones.ExceptionPersona;
import dominio.excepciones.ExceptionPersonaDniNulo;
import dominio.excepciones.ExceptionPersonaNombreNulo;

public class Persona {
	
	private String apellidoYNombre;
	private String dni;
	
	public Persona(String apellidoYNombre, String dni) throws ExceptionPersona {
			
		if(apellidoYNombre == null) {
			
			throw new ExceptionPersonaNombreNulo();
		}else if(dni == null) {
				throw new ExceptionPersonaDniNulo();
		}
			
		
		this.apellidoYNombre = apellidoYNombre;
		this.dni = dni;
		
	}
	
	public String getDniConFormato() {
		
		
		if(dni.length() == 8) {
			
			return dni.substring(0, 2) + "." + dni.substring(2, 5) + "." + dni.substring(5, 8);	
		}
		
		if(dni.length() == 6) {
			
			return dni.substring(0, 3) + "." + dni.substring(3, 6);
			
		}
		
		if(dni.length() == 9) {
			
			return dni.substring(0, 3) + "." + dni.substring(3, 6) + "." + dni.substring(6, 9);
		}
		
		return null;
		
	}

	public String getApellidoYNombre() {
	
		return apellidoYNombre;
	}

	public String getDni() {
		
		return dni;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoYNombre == null) ? 0 : apellidoYNombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellidoYNombre == null) {
			if (other.apellidoYNombre != null)
				return false;
		} else if (apellidoYNombre.compareToIgnoreCase(other.apellidoYNombre) > 0)
			return false;
		return true;
	}
	

	
}
