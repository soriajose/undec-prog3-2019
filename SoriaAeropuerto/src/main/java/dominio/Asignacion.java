package dominio;

import excepciones.ExceptionCantidadIncorrecta;

public class Asignacion {

	private Pasajero miPasajero;
	private Asiento miAsiento;
	private String codigoAsignacion;
	
	public Asignacion(Pasajero miPasajero, Asiento miAsiento, String codigoAsignacion) {
		
		this.miPasajero = miPasajero;
		this.miAsiento = miAsiento;
		this.codigoAsignacion = codigoAsignacion;
		
	}

	public String getResumenAsignacion() {
		
		
		
		return "Pasajero: " + this.miPasajero.getApellido() + " " + this.miPasajero.getNombre() + " - Asiento: (" +
		this.miAsiento.getNumeroAsiento() + " - " + this.miAsiento.getiDAsiento() + ")";
	}
	
	
	
	
	
}
