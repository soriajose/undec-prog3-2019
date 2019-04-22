package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Persona;
import dominio.excepciones.ExceptionPersona;
import dominio.excepciones.ExceptionPersonaDniNulo;
import dominio.excepciones.ExceptionPersonaNombreNulo;

class PersonaTest {

	@Test
	void testPersonaNombreNulo() {
		try {
			Persona p = new Persona(null,"");
			fail("ExceptionPersonaNombreNulo Esperado.");
		}catch(ExceptionPersonaNombreNulo ex) {
			assertEquals("El nombre la persona debe ser nulo", ex.getMessage());
		}catch(ExceptionPersona ex) {
			fail("ExceptionPersonaNombreNulo Esperado.");
		}
	}
	
	@Test
	void testPersonaDniNulo() {
		try {
			Persona p = new Persona("",null);
			fail("ExceptionPersonaDniNulo Esperado.");
		}catch(ExceptionPersonaDniNulo ex) {
			assertEquals("El Dni de la persona no puede ser nulo", ex.getMessage());
		}catch(ExceptionPersona ex) {
			fail("ExceptionPersonaDniNulo Esperado.");
		}
	}
	
	@Test
	void testPersonaFormatoDni() {
		try {
			Persona p1 = new Persona("Luis J.","12456789");
			Persona p2 = new Persona("Luis J.","123456");
			Persona p3 = new Persona("Luis J.","123456789");
			assertEquals("12.456.789",p1.getDniConFormato());
			assertEquals("123.456",p2.getDniConFormato());
			assertEquals("123.456.789",p3.getDniConFormato());
		}catch(ExceptionPersona ex) {
			fail("Se genero ExceptionPersona.");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			fail("Se genero Exception.");
		}
	}
	
	@Test
	void testPersonaDuplicada() {
		try {
			Persona p1 = new Persona("Luis J.","1");
			Persona p2 = new Persona("luis J.","2");
			Persona p3 = new Persona("Luis j.","3");
			Persona p4 = new Persona("Luis j","4");
			assertEquals(true,p1.equals(p2));
			assertEquals(true,p1.equals(p3));
			assertEquals(false,p1.equals(p4));
			assertEquals(true,p2.equals(p3));
		}catch(ExceptionPersona ex) {
			fail("Se genero ExceptionPersona.");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			fail("Se genero Exception.");
		}
	}
	

}
