package dominio;

import java.util.ArrayList;

import excepciones.ExceptionNulo;


public class Avion {

	private Integer idAvion;
	private String	modelo;
	private String	matricula;
	private ArrayList<Asiento> misAsientos = new ArrayList<Asiento>();
	
	
	public Avion(Integer idAvion, String modelo, String matricula) {
		
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		
		
	}
	
	
	public static Avion factoryAvion(Integer idAvion, String modelo, String matricula) throws ExceptionNulo{
		
		if(idAvion == null || modelo == null || modelo == "" || matricula == null || matricula == "") {
			
			throw new ExceptionNulo("Erro en atributo de la clase Avion");
			
		}
		
		
		return new Avion(idAvion, modelo, matricula);
	}


	public ArrayList<Asiento> getMisAsientos() {
		return misAsientos;
	}


	public void setMisAsientos(ArrayList<Asiento> misAsientos) {
		this.misAsientos = misAsientos;
	}


	public Integer getIdAvion() {
		return idAvion;
	}


	public void setIdAvion(Integer idAvion) {
		this.idAvion = idAvion;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
