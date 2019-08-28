package dominio;

public class ConsultarAsiento {

	
	
	public ConsultarAsiento() {
		
		
		
	}
	

	public static int getCantidadAsientos(Avion avion) {
		
		return avion.getMisAsientos().size();
	}
	
	
	public static String getConsultarAsiento(Avion avion, String numeroAsiento) {
		
		for (Asiento indice : avion.getMisAsientos()) {
			
			if(indice.getNumeroAsiento().equals(numeroAsiento)) {
				
				return "ID del avion: " + avion.getIdAvion() + " - Modelo: " + avion.getModelo() + " - Matricula: " + avion.getMatricula() +
				" - ID Asiento: " + indice.getIdAsiento() + " - Numero: " + indice.getNumeroAsiento();		
			}
			
		}
		
		return "El asiento no se encuentra cargado!";
	}
	
	
	
}	
