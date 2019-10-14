package ar.edu.undec.modelo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pilotos")
@SequenceGenerator(name = "piloto_id_seq",initialValue = 1, sequenceName = "piloto_id_seq", allocationSize = 1)
public class Piloto {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "piloto_id_seq")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPiloto;
	
	private String nombre;

	public Integer getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(Integer idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Piloto() {
		
	}

	public Piloto(Integer idPiloto, String nombre) {
		this.idPiloto = idPiloto;
		this.nombre = nombre;
	}
	
	
	
	
}
