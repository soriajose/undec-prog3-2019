package dominio;

import excepciones.ExceptionNulo;

public class Asiento {

	private Integer iDAsiento;
	private String numeroAsiento;
	
	public Asiento(Integer iDAsiento, String numeroAsiento) {
		
		this.iDAsiento = iDAsiento;
		this.numeroAsiento = numeroAsiento;
			
	}
	

	public static Asiento asientoFactory(Integer idAsiento, String numeroAsiento) throws ExceptionNulo {
	
		if(idAsiento == null || numeroAsiento == null) {
			
			throw new ExceptionNulo("Atributo del Asiento nulo");
		}
		
		return new Asiento(idAsiento, numeroAsiento);
	}
	
	
	
	public String getResumenAsiento() {

		return "ID de asiento: " + this.iDAsiento + " - Numero Asiento: " + this.numeroAsiento;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iDAsiento == null) ? 0 : iDAsiento.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asiento other = (Asiento) obj;
		if (iDAsiento == null) {
			if (other.iDAsiento != null)
				return false;
		} else if (!iDAsiento.equals(other.iDAsiento))
			return false;
		return true;
	}


	
}
