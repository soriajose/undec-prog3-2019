package modelo;

import excepciones.VehiculoIncompletoException;

public class Vehiculo {
	
	private Integer idVehiculo;
	private String marcaModelo;
	private String patente;
	private int anio;
	
	
	public Vehiculo(Integer idVehiculo, String marcaModelo, String patente, int anio) {
		
		this.idVehiculo = idVehiculo;
		this.marcaModelo = marcaModelo;
		this.patente = patente;
		this.anio = anio;
		
	}

	
	public static Vehiculo factoryVehiculo(Integer idVehiculo, String marcaModelo, String matricula, int anio) throws VehiculoIncompletoException {
		
		if(matricula == null || matricula == "") {
			
			throw new VehiculoIncompletoException("El vehiculo debe tener una matricula");
			
		}
		
		
		return new Vehiculo(idVehiculo, marcaModelo, matricula, anio);
	}

	

	public String mostrarVehiculo() {
		
		return this.getMarcaModelo() + " modelo " + this.getAnio() + " - Patente " + this.getPatente();
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}


	public Integer getIdVehiculo() {
		return idVehiculo;
	}


	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}


	public String getMarcaModelo() {
		return marcaModelo;
	}


	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}


	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	
	
}
