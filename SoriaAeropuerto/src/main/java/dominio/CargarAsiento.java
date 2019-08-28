package dominio;

public class CargarAsiento {
	
	public CargarAsiento() {
		
		
	}
	
	public static boolean cargarAsientosAlAvion(Avion avion, Asiento asiento) {
		
		if(!avion.getMisAsientos().contains(asiento)) {
			
			avion.getMisAsientos().add(asiento);
			
			return true;
		}
		
		return false;
	}
	
	
	
}
