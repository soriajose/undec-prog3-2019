package dominio;

import java.time.LocalDate;

import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

public class Piloto {
	
	private Integer idPiloto;
	private String nombre;
	private String apellido;
	private String documento;
	private LocalDate fechaNacimiento;
	
	
	public Piloto(Integer idPiloto, String nombre, String apellido, String documento, LocalDate fechaNacimiento) throws ExceptionNulo, ExceptionVacio {
		
		if(idPiloto == null) {
			
			throw new ExceptionNulo("El ID del Piloto no puede ser nulo");
			
		}
		
		if(nombre == null) {
			
			throw new ExceptionNulo("El nombre del Piloto no puede ser nulo");
			
		}
		
		if(apellido == null) {
			
			throw new ExceptionNulo("El apellido del Piloto no puede ser nulo");
			
		}
		
		if(documento == null) {
			
			throw new ExceptionNulo("El documento del Piloto no puede ser nulo");
			
		}
		
		if(fechaNacimiento == null) {
			
			throw new ExceptionNulo("La fecha no puede ser nula");
			
		}
		
		if(nombre == "") {
			
			throw new ExceptionVacio("El nombre del Piloto no puede ser nulo");
			
		}
		
		if(apellido == "") {
			
			throw new ExceptionVacio("El apellido del Piloto no puede ser nulo");
			
		}
		
		if(documento == "") {
			
			throw new ExceptionVacio("El documento del Piloto no puede ser nulo");
			
		}
		
		this.idPiloto = idPiloto;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	
	public String getResumenPiloto() {
		
		
		
		return "ID: " + this.idPiloto + " - Nombre: " + this.nombre + " - Apellido: " + this.apellido + " - DNI: " + this.documento + " - Fecha de Nacimiento: " + 
		this.fechaNacimiento;
	}
	
	
}
