package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Aerolinea;
import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

class TestAerolineas {

	@Test
	void test_Atributos_Aerolineas() throws ExceptionVacio, ExceptionNulo {
		
		Aerolinea aerolinea1 = null;
		
		try {
			
			aerolinea1 = new Aerolinea(1234, "Fly Emirates");
			
		}catch(Exception exception) {
			
			fail("Esta liea no deberia correrse");
			
		}
		
		
		try {
			
			aerolinea1 = new Aerolinea(null, "Fly Emirates");
			
		}catch(ExceptionNulo exception) {
			
			assertEquals("El ID de la Aerolinea no puede ser nulo", exception.getMessage());
		}
		
		
		try {
			
			aerolinea1 = new Aerolinea(1234, "");
			
		}catch(ExceptionVacio exception) {
			
			assertEquals("El nombre de la Aerolinea no puede ser vacio", exception.getMessage());
		}
		
		
		try {
			
			aerolinea1 = new Aerolinea(1234, null);
			
		}catch(ExceptionNulo exception) {
			
			assertEquals("El nombre de la Aerolinea no puede ser nulo", exception.getMessage());
		}
		
		
	}

	
	@Test
	void test_Resumen_Aerolineas() {
		
		Aerolinea aerolinea = null;
		
		try {
			
			aerolinea = new Aerolinea(1234, "Fly Emirates");
			
			assertEquals("ID Aerolinea: 1234 - Nombre: Fly Emirates", aerolinea.getResumenAerolinea());
			
			
		}catch(Exception exception) {
			
			fail("Esta lina no deberia correrse");
		}
		
		
		try {
			
			aerolinea = new Aerolinea(1235, "Qatar Airways");
			
			assertEquals("ID Aerolinea: 1235 - Nombre: Qatar Airways", aerolinea.getResumenAerolinea());
			
			
		}catch(Exception exception) {
			
			fail("Esta lina no deberia correrse");
		}
		
		try {
			
			aerolinea = new Aerolinea(1236, "Eva Air");
			
			assertEquals("ID Aerolinea: 1236 - Nombre: Eva Air", aerolinea.getResumenAerolinea());
			
			
		}catch(Exception exception) {
			
			fail("Esta lina no deberia correrse");
		}
		
		
		
	}

	
	
	
	
	
}
