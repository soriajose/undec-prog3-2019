package dominio.excepciones;

@SuppressWarnings("serial")
public class ExceptionPersonaDniNulo extends ExceptionPersona{
	
	
	public ExceptionPersonaDniNulo() {
		
		super("El Dni de la persona no puede ser nulo");
		
	}
}
