package dominio;

public class GestorPersona {

	private static GestorPersona miGestorPersona;
	
	
	public GestorPersona() {
		
	}
	
	public static GestorPersona getInstancia() {
		
		if(miGestorPersona == null) {
			
			
			miGestorPersona = new GestorPersona();
		}
		
		
		return miGestorPersona;
	}
	

	public String getDniConFormato(String dni) {
		
		
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
	
	
}
