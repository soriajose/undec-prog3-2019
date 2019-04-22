package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Cargo;
import dominio.Entrenador;
import dominio.Equipo;
import dominio.GestorEntrenador;
import dominio.Jugador;
import dominio.Persona;
import dominio.Puesto;
import dominio.excepciones.ExceptionPersona;

class JugadorEntrenadorTest {

	@Test
	void testJugadorEntrenador()  {
		try {
			Persona p = new Jugador("Luis D.","12345678",Puesto.ARQUERO);
			Jugador j = (Jugador) p;
			assertEquals(Puesto.ARQUERO,j.getMiPuesto());
			
			p = new Jugador("Luis D.","12345678",Puesto.DEFENSOR);
			j = (Jugador) p;
			assertEquals(Puesto.DEFENSOR,j.getMiPuesto());
			
			p = new Jugador("Luis D.","12345678",Puesto.DELANTERO);
			j = (Jugador) p;
			assertEquals(Puesto.DELANTERO,j.getMiPuesto());
			
			
			p = new Entrenador("Luis D.","12345678",Cargo.PRIMERENTRENADOR);
			Entrenador e = (Entrenador) p;
			assertEquals(Cargo.PRIMERENTRENADOR,e.getMiCargo());
			
			p = new Entrenador("Luis D.","12345678",Cargo.SEGUNDOENTRENADOR);
			e = (Entrenador) p;
			assertEquals(Cargo.SEGUNDOENTRENADOR,e.getMiCargo());
			
			p = new Entrenador("Luis D.","12345678",Cargo.AYUDANTE);
			e = (Entrenador) p;
			assertEquals(Cargo.AYUDANTE,e.getMiCargo());
			
		}catch(ExceptionPersona ex) {
			fail("ExceptionPersona No Esperada.");
		}
	}
	
	
	@Test
	void testEntrenador() {
		
		GestorEntrenador miGestorEntrenador = GestorEntrenador.getInstancia();
	
		try {
		
			Entrenador e = new Entrenador("Luis D.","12345678",Cargo.PRIMERENTRENADOR);
			assertEquals("Su nombre completo es: Luis D.", miGestorEntrenador.getMostrarEntrenador(e.getApellidoYNombre()));
			assertEquals("Su DNI es: 12345678", miGestorEntrenador.getMostrarDNI(e.getDni()));
			assertEquals("Su cargo es: PRIMERENTRENADOR", miGestorEntrenador.getMostrarCargo(e.getMiCargo()));
			
			
		} catch (ExceptionPersona e1) {
			
			fail("Esta lina no deberia correrse");
		}
	
		
	}
	
/*	
	@Test
	void testEntrenadorSegundaParte() {
		
	try {
			
		Equipo equipo = new Equipo("Boca Juniors");
			
		Persona p1 = new Entrenador("Luis D.","12345678",Cargo.PRIMERENTRNADOR);
		Entrenador e1 = (Entrenador) p1;
		equipo.addEntrenador(e1);
		assertEquals(1, getCantidadEntrenadores());
		
		Persona p2 = new Entrenador("Luis D.","12345678",Cargo.SEGUNDOENTRENADOR);
		Entrenador e2 = (Entrenador) p2;
		equipo.addEntrenador(e2);
		assertEquals(2, getCantidadEntrenadores());
		
		Persona p3 = new Entrenador("Luis D.","12345678",Cargo.AYUDANTE);
		Entrenador e3 = (Entrenador) p3;
		equipo.addEntrenador(e3);
		assertEquals(3, getCantidadEntrenadores());
		
		Persona p4 = new Entrenador("Luis D.","12345678",Cargo.PRIMERENTRNADOR);
		Entrenador e4 = (Entrenador) p4;
		equipo.addEntrenador(e4);
		assertEquals(3, getCantidadEntrenadores());
		
		Persona p5 = new Entrenador("Luis D.","12345678",Cargo.AYUDANTE);
		Entrenador e5 = (Entrenador) p5;
		equipo.addEntrenador(e5);
		assertEquals(4, getCantidadEntrenadores());
		
		Persona p6 = new Entrenador("Luis D.","12345678",Cargo.SEGUNDOENTRENADOR);
		Entrenador e6 = (Entrenador) p6;
		equipo.addEntrenador(e6);
		assertEquals(4, getCantidadEntrenadores());
		
		
		List<Entrenador> entrenador = equipo.getMisEntrenadores();
			
		assertEquals(e2, entrenador.getEntrenadores(0));
		assertEquals(e3, entrenador.getEntrenadores(1));
		assertEquals(e1, entrenador.getEntrenadores(2));
		assertEquals(e4, entrenador.getEntrenadores(3));

		
		}catch(ExceptionPersona ex) {
			fail("ExceptionPersona No Esperada.");
		}
	}
*/
}
