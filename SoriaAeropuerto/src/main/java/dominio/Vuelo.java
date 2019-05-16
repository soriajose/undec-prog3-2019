package dominio;

import java.time.LocalTime;
import java.util.ArrayList;

public class Vuelo {
	
	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalTime fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalTime fechaHoraArribo;
	private Aerolinea aerolinea;
	private Avion avion;
	
	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalTime fechaHoraSalida, Aeropuerto arribo, LocalTime fechaHoraArribo,
			Aerolinea aerolinea, Avion avion) {
		
		
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.avion = avion;
	}


	public Object getResumenVuelo() {
		
		return null;
	}

	
	
	
	
}
