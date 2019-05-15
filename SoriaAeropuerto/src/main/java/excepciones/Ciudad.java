package excepciones;

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
			
			throw new ExceptionNulo("El codigo postal de la ciudad no puede ser nulo");
			
		}
		
		
		if(nombre.equals("")) {
			
			throw new ExceptionNulo("El nombre de la ciudad no puede ser vacio");
			
		}
		
		if(codigoPostal.equals("")) {
			
			throw new ExceptionNulo("El codigo postal de la ciudad no puede ser vacio");
			
		}
		
		this.ciudad = ciudad;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		
		
	}
	
	
	
	
}
