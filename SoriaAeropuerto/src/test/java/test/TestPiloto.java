package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TestPiloto {

	@Test
	void test_Atributos_Piloto() {
		
		//(idPiloto, apellido, nombre, documento, fechaNacimiento)
		
		Piloto piloto;
		
		try {
			
			piloto = new Piloto(0001, "Soria", "Jose", "40300672", LocalDate.of(2019, 3, 2));
			
			
		}catch(Exception exception) {
			
			fail("Esta linea no deberia correrse");	
		}
	
		
		try {
			
			piloto = new Piloto(null, "Soria", "Jose", "40300672", LocalDate.of(2019, 3, 2));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionNulo exception) {
		
			assertEquals("El ID del piloto no puede ser nulo", exception.getMessage());
			
		}
		
		try {
			
			piloto = new Piloto("", "Soria", "Jose", "40300672", LocalDate.of(2019, 3, 2));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionVacio exception) {
		
			assertEquals("El ID del piloto no puede ser vacio", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(0001, null, "Jose", "40300672", LocalDate.of(2019, 3, 2));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionNulo exception) {
		
			assertEquals("El apellido del piloto no puede ser nulo", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(0001, "", "Jose", "40300672", LocalDate.of(2019, 3, 2));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionVacio exception) {
		
			assertEquals("El apellido del piloto no puede ser vacio", exception.getMessage());
			
		}
		
		try {
			
			piloto = new Piloto(0001, "Soria", "", "40300672", LocalDate.of(2019, 3, 2));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionVacio exception) {
		
			assertEquals("El nombre del piloto no puede ser vacio", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(0001, "Soria", null, "40300672", LocalDate.of(2019, 3, 2));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionNulo exception) {
		
			assertEquals("El apellido del piloto no puede ser nulo", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(0001, "Soria", "Jose", "", LocalDate.of(2019, 3, 2));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionVacio exception) {
		
			assertEquals("El documento del piloto no puede ser vacio", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(0001, "Soria", "Jose", null , LocalDate.of(2019, 3, 2));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionNulo exception) {
		
			assertEquals("El documento del piloto no puede ser nulo", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(0001, "Soria", "Jose", "40300672", "");
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionVacio exception) {
		
			assertEquals("La fecha no debe ser vacia", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(0001, "Soria", "Jose", "40300672", null);
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionVacio exception) {
		
			assertEquals("La fecha no debe ser nulo", exception.getMessage());
			
		}
		
		
		
	}
	
	
	
	
	
}
