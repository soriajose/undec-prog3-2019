package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import excepciones.ClienteIncompletoException;

public class Cliente {
	
	private Integer idCliente;
	private String	apellido;
	private String nombre;
	private String documento;
	private LocalDate fechaNacimiento;
	private String domicilio;
	private String telefono;
	
	private ArrayList<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();
	
	
	public Cliente(Integer idCliente, String apellido, String nombre, String documento, LocalDate fechaNacimiento, String domicilio, String telefono) {
		
		this.idCliente = idCliente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.telefono = telefono;
		
	}
	




	public String getTelefono() {
		return telefono;
	}





	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}





	public static Cliente factoryCliente(int idCliente, String apellido, String nombre, String documento, LocalDate fechaNacimiento, String domicilio, String telefono) throws ClienteIncompletoException {
		
		if(documento == null || documento == "") {
			
			throw new ClienteIncompletoException("El cliente debe tener un documento");
			
		}
		
		return new Cliente(idCliente, apellido, nombre, documento, fechaNacimiento, domicilio, telefono);
	}





	public void asignarVehiculo(Vehiculo elVehiculo) {
		
		misVehiculos.add(elVehiculo);
		
	}





	public List<Vehiculo> devolverVehiculos() {
		
		
		return this.misVehiculos;
	}





	public Integer getIdCliente() {
		return idCliente;
	}





	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}





	public String getApellido() {
		return apellido;
	}





	public void setApellido(String apellido) {
		this.apellido = apellido;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getDocumento() {
		return documento;
	}





	public void setDocumento(String documento) {
		this.documento = documento;
	}





	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}





	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}





	public String getDomicilio() {
		return domicilio;
	}





	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}





	public ArrayList<Vehiculo> getMisVehiculos() {
		return misVehiculos;
	}





	public void setMisVehiculos(ArrayList<Vehiculo> misVehiculos) {
		this.misVehiculos = misVehiculos;
	}
	
	
	

}
