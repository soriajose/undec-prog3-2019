package dominio;

import java.time.LocalDate;

import excepciones.ExceptionNulo;


public class Piloto {

	private Integer idPiloto;
	private String	apellido;
	private String	nombre;
	private String	documento;
	private LocalDate fechaNacimiento;
	
	
	public Piloto(Integer idPiloto, String apellido, String nombre, String documento, LocalDate fechaNacimiento) {
		
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.nombre = nombre;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	
	
	public static Piloto factoryPiloto(Integer idPiloto, String apellido, String nombre, String documento, LocalDate fechaNacimiento) throws ExceptionNulo {
		
		if(idPiloto == null || apellido == null || apellido == "" || nombre == null || nombre == "" || documento == null || documento == "" ||
				fechaNacimiento == null) {
			
			throw new ExceptionNulo("Error en atributo de la clase Piloto");
		}
		
		
		return new Piloto(idPiloto, apellido, nombre, documento, fechaNacimiento);
	}
	
	
	
}
