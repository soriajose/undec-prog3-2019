package modelo;

import java.time.LocalDate;

import excepciones.ServiceIncompletoException;

public class Service {
	
	private Integer idService;
	private Vehiculo elVehiculo;
	private Cliente elCliente;
	private LocalDate fechaService;
	private String detalleService;
	private float precio;
	
	public Service(Integer idService, Vehiculo elVehiculo, Cliente elCliente, LocalDate fechaService, String detalleService, float precio) {
		
		this.idService = idService;
		this.elVehiculo = elVehiculo;
		this.elCliente = elCliente;
		this.fechaService = fechaService;
		this.detalleService = detalleService;
		this.precio = precio;
		
	}
	
	
	
	
	
	
	public static Service factoryService(Integer idService, Vehiculo elVehiculo, Cliente elCliente, LocalDate fechaService, String detalleService,
			float precio) throws ServiceIncompletoException {
		
		if(elVehiculo == null) {
			
			throw new ServiceIncompletoException("Error! El vehiculo no puede ser nulo");
			
		}
		
		
		return new Service(idService, elVehiculo, elCliente, fechaService, detalleService, precio);
	}






	public String mostrarResumen() {
		
		
		
		
		return "Service Nro: " + this.idService +"\nCliente: " + this.elCliente.getApellido() + ", " + this.elCliente.getNombre() + " - " + this.elCliente.getTelefono()
		+"\nVehiculo: " + this.elVehiculo.getMarcaModelo() + " modelo " + this.elVehiculo.getAnio() + " - " + "Patente " + this.elVehiculo.getPatente()
		+"\nTrabajo Realizado: " + this.detalleService;
	}

	
	
	
	
	
	
	
	
	
}
