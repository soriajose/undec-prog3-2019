package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import dominio.Piloto;
import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

class TestPiloto {

	@Test
	void test_Atributos_Piloto() throws ExceptionVacio, ExceptionNulo {
		
		Piloto piloto = null;
		
		try {
			
			piloto = new Piloto(null, "Soria", "Jose", "40300672", LocalDate.of(1996, 8, 16));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionNulo exception) {
		
			assertEquals("El ID del piloto no puede ser nulo", exception.getMessage());
			
		}
		
		try {
			
			piloto = new Piloto(1231, null, "Jose", "40300672", LocalDate.of(2019, 3, 2));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionNulo exception) {
		
			assertEquals("El apellido del piloto no puede ser nulo", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(1231, "", "Jose", "40300672", LocalDate.of(2019, 3, 2));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionVacio exception) {
		
			assertEquals("El apellido del piloto no puede ser vacio", exception.getMessage());
			
		}
		
		try {
			
			piloto = new Piloto(1231, "Soria", "", "40300672", LocalDate.of(1996, 8, 16));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionVacio exception) {
		
			assertEquals("El nombre del piloto no puede ser vacio", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(1231, "Soria", null, "40300672", LocalDate.of(1996, 8, 16));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionNulo exception) {
		
			assertEquals("El apellido del piloto no puede ser nulo", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(1231, "Soria", "Jose", "", LocalDate.of(1996, 8, 16));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionVacio exception) {
		
			assertEquals("El documento del piloto no puede ser vacio", exception.getMessage());
			
		}
		
		
		try {
			
			piloto = new Piloto(1231, "Soria", "Jose", null , LocalDate.of(1996, 8, 16));
			fail("Esta linea no deberia correrse");
			
		}catch(ExceptionNulo exception) {
		
			assertEquals("El documento del piloto no puede ser nulo", exception.getMessage());
			
		}
		
		
	}
	
	
	@Test
	void test_Piloto_Correcto() {
		
		
		try {
			
			Piloto piloto1 = new Piloto(1231, "Soria", "Jose", "40300672", LocalDate.of(1996, 8, 16));
			assertEquals("ID: 1231 - Apellido: Soria - Nombre: Jose - DNI: 40300672 - Fecha Nacimiento: 16-8-1996", piloto1.getResumenPiloto());
			
		}catch(Exception exception) {
			
			fail("Esta linea no deberia correrse");	
		}
		
		
		try {
			
			Piloto piloto2 = new Piloto(1232, "Fajardo", "Hugo", "12345678", LocalDate.of(1980, 10, 5));
			assertEquals("ID: 1232 - Apellido: Fajardo - Nombre: Hugo - DNI: 12345678 - Fecha Nacimiento: 5/10/1980", piloto2.getResumenPiloto());
			
		}catch(Exception exception) {
			
			fail("Esta linea no deberia correrse");	
		}
		
		
		try {
			
			Piloto piloto3 = new Piloto(1233, "Ruitti", "Javier", "87654321", LocalDate.of(1985, 3, 9));
			assertEquals("ID: 1233 - Apellido: Ruitti - Nombre: Javier - DNI: 87654321 - Fecha Nacimiento: 9/3/1985", piloto3.getResumenPiloto());
			
		}catch(Exception exception) {
			
			fail("Esta linea no deberia correrse");	
		}
		
		
	}
	
	
	
	
}
