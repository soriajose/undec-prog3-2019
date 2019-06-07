package dominio;

import java.time.LocalDate;

import excepciones.ExceptionNulo;

public class Piloto {
	
	private Integer idPiloto;
	private String nombre;
	private String apellido;
	private String documento;
	private LocalDate fechaNacimiento;
	
	
	public Piloto(Integer idPiloto, String nombre, String apellido, String documento, LocalDate fechaNacimiento) {
			
		this.idPiloto = idPiloto;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	public static Piloto factoryPiloto(Integer idPiloto, String nombre, String apellido, String documento, LocalDate fechaNacimiento) throws ExceptionNulo {
		
		if(idPiloto == null || nombre == null || apellido == null || documento == null || fechaNacimiento == null) {
			
			throw new ExceptionNulo("Atributo del Piloto nulo");
		}
		
		return new Piloto(idPiloto, nombre, apellido, documento, fechaNacimiento);
	}
	
	public String getResumenPiloto() {
	
		return "ID: " + this.idPiloto + " - Nombre: " + this.nombre + " - Apellido: " + this.apellido + " - DNI: " + this.documento + " - Fecha de Nacimiento: " + 		this.fechaNacimiento;
	}


	
	
	
}
