package dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.List;
import java.util.ArrayList;

public class Avion {

	private Integer idAvion;
	private String modelo;
	private String matricula;
	private ArrayList<Asiento> listaAsientos;
	
	public Avion(Integer idAvion, String modelo, String matricula) {
		
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		this.listaAsientos = new ArrayList<Asiento>();
		
	}

	
	
	public boolean agregarAsiento(Asiento asiento) {
		
		if(!asientoRepetido(asiento)) {
			
			this.listaAsientos.add(asiento);
			return true;
		}
	
		return false;
	}



	private boolean asientoRepetido(Asiento asiento) {
		
		if(this.listaAsientos.contains(asiento.getiDAsiento())) {
			
			return true;
		}
		
		
		return false;
	}



	public String getResumenAvion() {
	
		return "AVION: " + this.modelo.toUpperCase() + " - ID: " + this.idAvion + " - MATRICULA: " + this.matricula.toUpperCase();
	}
	
//	assertEquals("AVION: BOEING 737-800 - ID: 1001 - MATRICULA: N785AN (1 asiento)", avion.getResumenAvion());
	
	
	
	
}
