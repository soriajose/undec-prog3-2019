package dominio.excepciones;

@SuppressWarnings("serial")
public class ExceptionPersonaNombreNulo extends ExceptionPersona {
	
	
	public ExceptionPersonaNombreNulo() {
		
		super("El nombre la persona debe ser nulo");
		
	}
}
