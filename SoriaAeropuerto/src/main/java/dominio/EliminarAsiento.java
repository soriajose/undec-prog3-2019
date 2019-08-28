package dominio;

public class EliminarAsiento {

	
	
	public EliminarAsiento() {
		
		
	}

	public static boolean eliminarAsientoPorID(Avion avion, Integer idAsiento) {
		
		for (Asiento indice : avion.getMisAsientos()) {
			
			if(indice.getIdAsiento().equals(idAsiento)) {
				
				avion.getMisAsientos().remove(indice);
				
				return true;
			}
			
			
		}
		
		return false;
		
	}
	
	
	
	
	
}
