package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;import org.junit.rules.ExpectedException;

class TestPasajero {

	@Test
	void test_ParametrosPasajero() {
		
		try {
			
			Pasajero pasajero1 = new Pasajero(null, "201234561", "Soria", "Jose", "15123456");
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionNulo exception) {
			
			assertEquals("El ID no puede ser nulo", exception.getMenssage());
			
		}
		
		try {
			
			Pasajero pasajero1 = new Pasajero("", "201234561", "Soria", "Jose", "15123456");
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionVacio exception) {
			
			assertEquals("El ID no puede ser vacio", exception.getMenssage());
			
		}
		
		
		try {
			
			Pasajero pasajero1 = new Pasajero(1001, null, "Soria", "Jose", "15123456");
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionNulo exception) {
			
			assertEquals("El CUIL no puede ser nulo", exception.getMenssage());
			
		}
		
		try {
			
			Pasajero pasajero1 = new Pasajero(1001, "", "Soria", "Jose", "15123456");
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionVacio exception) {
			
			assertEquals("El CUIL no puede ser vacio", exception.getMenssage());
			
		}
		
		
		try {
			
			Pasajero pasajero1 = new Pasajero(1001, "201234561", null, "Jose", "15123456");	
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionNulo exception) {
			
			assertEquals("El apellido no puede ser nulo", exception.getMenssage());
			
		}
		
		try {
			
			Pasajero pasajero1 = new Pasajero(1001, "201234561", "", "Jose", "15123456");	
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionVacio exception) {
			
			assertEquals("El apellido no puede ser vacio", exception.getMenssage());
			
		}
		
		try {
			
			Pasajero pasajero1 = new Pasajero(1001, "201234561", "Soria", null, "15123456");	
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionNulo exception) {
			
			assertEquals("El nombre no puede ser nulo", exception.getMenssage());
			
		}
		
		try {
			
			Pasajero pasajero1 = new Pasajero(1001, "201234561", "Soria", "", "15123456");	
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionVacio exception) {
			
			assertEquals("El nombre no puede ser vacio", exception.getMenssage());
			
		}
		
		
		try {
			
			Pasajero pasajero1 = new Pasajero(1001, "201234561", "Soria", "Jose", null);	
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionNulo exception) {
			
			assertEquals("El telefono no puede ser nulo", exception.getMenssage());
			
		}
		
		
		try {
			
			Pasajero pasajero1 = new Pasajero(1001, "201234561", "Soria", "Jose", "");	
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionVacio exception) {
			
			assertEquals("El telefono no puede ser vacio", exception.getMenssage());
			
		}
		
		
	}

	@Test
	void test_CUILPasajero() {
		
		Pasajero pasajero1 = null;
		
		try {		
		
			pasajero1 = new Pasajero(1001, "10123456781", "Soria", "Jose", "15123456");
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionCantidadIncorrecta exception) {
			
			assertEquals("La cantidad es dinstinta a 10 y 11", exception.getMenssage());
			
		}
		
		try {		
			
			pasajero1 = new Pasajero(1001, "1012345678134", "Soria", "Jose", "15123456");
			fail("Esta lina no deberia correrse");
			
		}catch(ExceptionCantidadIncorrecta exception) {
			
			assertEquals("La cantidad es dinstinta a 10 y 11", exception.getMenssage());
			
		}
		
		
		//Test para el formato del CUIL. 
		try {
		
			pasajero1 = new Pasajero(1001, "10123456781", "Soria", "Jose", "15123456");
			assertEquals("El numero de CUIL es: 10-12345678-1", pasajero1.getCUILFormato());
			
		}catch(ExceptionCantidadIncorrecta exception) {
			
			fail("Esta linea no deberia correrse");
			
		}
		
		try {
			
			pasajero1 = new Pasajero(1002, "30876543212", "Fajardo", "Hugo", "15654321");
			assertEquals("El numero de CUIL es: 30-8765421-2", pasajero1.getCUILFormato());
			
		}catch(ExceptionCantidadIncorrecta exception) {
			
			fail("Esta linea no deberia correrse");
			
		}
		
	}
		

}
