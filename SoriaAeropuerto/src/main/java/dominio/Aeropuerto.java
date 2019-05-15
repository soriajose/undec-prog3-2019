package dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aeropuerto {

	
	private Integer idAeropuerto;
	private String nombre;
	private Ciudad miCiudad;
	private String codigo;
	
	public Aeropuerto(Integer idAeropuerto, String nombre, Ciudad miCiudad, String codigo) {
		
		this.idAeropuerto = idAeropuerto;
		this.nombre = nombre;
		this.miCiudad = miCiudad;
		this.codigo = codigo;
		
	}
	
	
	public String getResumenAeropuerto() {
		
		
		
	//	return "[" + this.codigo + " - " + this.codigo + "] " + this.nombre.toUpperCase() + " - " + this.miCiudad.getNombre().toUpperCase() + " (CP: " + this.miCiudad.getCodigoPostal() + ")";
	
		return "";
	}
	
	
	
}
