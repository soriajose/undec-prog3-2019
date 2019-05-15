package dominio;

public class Asiento {

	private Integer iDAsiento;
	private String numeroAsiento;
	
	public Asiento(Integer iDAsiento, String numeroAsiento) {
		
		this.iDAsiento = iDAsiento;
		this.numeroAsiento = numeroAsiento;
		
		
	}
	
	
	public String getResumenAsiento() {
		

		return "ID de asiento: " + this.iDAsiento + " - Numero Asiento: " + this.numeroAsiento;
	}


	public Integer getiDAsiento() {
		return iDAsiento;
	}


	public void setiDAsiento(Integer iDAsiento) {
		this.iDAsiento = iDAsiento;
	}


	public String getNumeroAsiento() {
		return numeroAsiento;
	}


	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}
	
	
}
