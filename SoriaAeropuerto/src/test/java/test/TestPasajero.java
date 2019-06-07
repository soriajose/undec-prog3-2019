package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;import org.junit.rules.ExpectedException;

import dominio.Pasajero;
import excepciones.ExceptionCantidadIncorrecta;
import excepciones.ExceptionNulo;


class TestPasajero {

	@Test
	void factoryPasajero_atributosCorrectos_instanciaCorrecta() throws ExceptionNulo, ExceptionCantidadIncorrecta {
		
		Pasajero pasajero1 = Pasajero.factoryPasajero(1001, "20123456781", "Soria", "Jose", "15123456");
		assertNotNull(pasajero1);
		
		Pasajero pasajero2 = Pasajero.factoryPasajero(1002, "30123456781", "Ruitti", "Javier", "15123457");
		assertNotNull(pasajero2);
		
		Pasajero pasajero3 = Pasajero.factoryPasajero(1003, "40123456781", "Fajardo", "Hugo", "15123458");
		assertNotNull(pasajero3);
		
	}
	
	@Test
	void cuilPasajero_getCUILFormato_formatoCorrecto() throws ExceptionNulo, ExceptionCantidadIncorrecta {
		
		Pasajero pasajero1 = Pasajero.factoryPasajero(1001, "20123456781", "Soria", "Jose", "15123456");
		assertEquals("El numero de CUIL es: 20-12345678-1", pasajero1.getCUILFormato());
	
		Pasajero pasajero2 = Pasajero.factoryPasajero(1002, "30123456781", "Ruitti", "Javier", "15123457");
		assertEquals("El numero de CUIL es: 30-12345678-1", pasajero2.getCUILFormato());
		
		
		Pasajero pasajero3 = Pasajero.factoryPasajero(1003, "40123456781", "Fajardo", "Hugo", "15123458");
		assertEquals("El numero de CUIL es: 40-12345678-1", pasajero3.getCUILFormato());
		
	}
	

	@Test
	void cuilPasajero_getCUILFormato_cantidadIncorrecta() throws ExceptionNulo, ExceptionCantidadIncorrecta {
		
		Assertions.assertThrows(ExceptionCantidadIncorrecta.class, ()-> Pasajero.factoryPasajero(1001, "101234567812", "Soria", "Jose", "15123456"));
		Assertions.assertThrows(ExceptionCantidadIncorrecta.class, ()-> Pasajero.factoryPasajero(1002, "300123456781", "Ruitti", "Javier", "15123457"));
		Assertions.assertThrows(ExceptionCantidadIncorrecta.class, ()-> Pasajero.factoryPasajero(1001, "4000123456781", "Fajardo", "Hugo", "15123458"));
		
		
		
	}
	

}
