package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Ciudad;
import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

class TestCiudad {

	@Test
	void test_Atributos_Ciudad() throws ExceptionVacio, ExceptionNulo {
		
		Ciudad ciudad1 = null;
		
		try {
			
			//(IdCIudad, nombre, codigoPostal)
			ciudad1 = new Ciudad(101, "Chilecito", "5360");
			
		}catch(Exception exception) {
			
			fail("Esta linea no deberia correrse");
	
		}

		
		try {
			
			//(IdCIudad, nombre, codigoPostal)
			ciudad1 = new Ciudad(null, "Chilecito", "5360");
			
		}catch(ExceptionNulo exception) {
			
			assertEquals("El ID de la ciudad no puede ser nulo", exception.getMessage());
			
		}
		
		
		try {
			
			//(IdCIudad, nombre, codigoPostal)
			ciudad1 = new Ciudad(101, null, "5360");
			
		}catch(ExceptionNulo exception) {
			
			assertEquals("El nombre de la ciudad no puede ser nulo", exception.getMessage());
		
		}
		
		
		try {
			
			//(IdCIudad, nombre, codigoPostal)
			ciudad1 = new Ciudad(101, "", "5360");
			
		}catch(ExceptionVacio exception) {
			
			assertEquals("El nombre de la ciudad no puede ser vacio", exception.getMessage());
			
		}
		
		
		try {
			
			//(IdCIudad, nombre, codigoPostal)
			ciudad1 = new Ciudad(101, "Chilecito", null);
			
		}catch(ExceptionNulo exception) {
			
			assertEquals("El codigo postal no puede ser nulo", exception.getMessage());
			
		}
		
		
		try {
			
			//(IdCIudad, nombre, codigoPostal)
			ciudad1 = new Ciudad(101, "Chilecito", "");
			
		}catch(ExceptionVacio exception) {
			
			assertEquals("El codigo postal no puede ser vacio", exception.getMessage());
			
		}
		
	
	}
	
	
	
	
}
