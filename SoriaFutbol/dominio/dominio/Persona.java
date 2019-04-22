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
