package dominio;

public class ResumenEquipo {
	
	private static ResumenEquipo gestorResumen;
	
	
	public static ResumenEquipo getInstancia() {
		
		if(gestorResumen == null) {
			
			gestorResumen = new ResumenEquipo();
		}
		
		return gestorResumen;
	}
	
	public ResumenEquipo() {
		
	}
	
	
	
}
