package dominio;

import excepciones.ExceptionNulo;

public class Asiento {
	
	private Integer idAsiento;
	private String	numeroAsiento;
	
	
	
	public Asiento(Integer idAsiento, String numeroAsiento) {
		
		this.idAsiento = idAsiento;
		this.numeroAsiento = numeroAsiento;
		
		
	}
	
	
	public static Asiento factoryAsiento(Integer idAsiento, String numeroAsiento) throws ExceptionNulo{
		
		if(idAsiento == null || numeroAsiento == null || numeroAsiento == "") {
			
			throw new ExceptionNulo("Error en atributo de la clase Asiento");
			
		}
		
		return new Asiento(idAsiento, numeroAsiento);
	}


	public Integer getIdAsiento() {
		return idAsiento;
	}


	public void setIdAsiento(Integer idAsiento) {
		this.idAsiento = idAsiento;
	}


	public String getNumeroAsiento() {
		return numeroAsiento;
	}


	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	
	
	
	
}
