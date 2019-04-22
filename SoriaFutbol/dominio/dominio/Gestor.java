package dominio;

public class Gestor {
	
	private static Gestor miGestor;
	
	
	public static Gestor getInstancia() {
		
		if(miGestor == null) {
			
			return miGestor = new Gestor();
		}
		
		return miGestor;
		
	}
	
	
	
	
}
