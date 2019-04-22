package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dominio.Equipo;
import dominio.Jugador;
import dominio.Puesto;
import dominio.excepciones.ExceptionPersona;

class EquipoTest {

	@Test
	void testEquipo_Nombre() {
		Equipo e = new Equipo("Yupanqui Sur");
		assertEquals("YUPANQUI SUR", e.getNombre());
		
		e = new Equipo();
		assertEquals("SIN NOMBRE", e.getNombre());
		
		e = new Equipo("1234567890123");
		assertEquals("123456789012", e.getNombre());
		
		e = new Equipo("12345678901234");
		assertEquals("123456789012", e.getNombre());
		
		e = new Equipo("123456");
		assertEquals("123456", e.getNombre());
	}
	
	@Test
	void testEquipo_CantidadesDeJugadores() throws ExceptionPersona{
		Jugador j1 = new Jugador("Luis","123456789",Puesto.ARQUERO);
		Jugador j2 = new Jugador("Carlos","987654321",Puesto.DEFENSOR);
		Jugador j3 = new Jugador("Alberto","65434321",Puesto.DELANTERO);
		Jugador j4 = new Jugador("Ernesto","45346789",Puesto.ARQUERO);
		Jugador j5 = new Jugador("Abel","987654321",Puesto.DEFENSOR);
		Jugador j6 = new Jugador("Anibal","987654321",Puesto.DEFENSOR);
		Jugador j7 = new Jugador("Jose","987654321",Puesto.DEFENSOR);
		
		Equipo e = new Equipo("Yupanqui Sur");
		assertEquals(0,e.getCantidadDeJugadores());
		
		e.addJugador(j1.getApellidoYNombre(), j1.getDni(), j1.getMiPuesto());		
		assertEquals(1,e.getCantidadDeJugadores());
		
		e.addJugador(j2.getApellidoYNombre(), j2.getDni(), j2.getMiPuesto());
		assertEquals(2,e.getCantidadDeJugadores());
		
		e.addJugador(j1.getApellidoYNombre(), j3.getDni(), j3.getMiPuesto());		
		assertEquals(2,e.getCantidadDeJugadores());
		
		e.addJugador(j3.getApellidoYNombre(), j3.getDni(), j3.getMiPuesto());		
		assertEquals(3,e.getCantidadDeJugadores());
		
		
		e.addJugador(j4.getApellidoYNombre(), j4.getDni(), j4.getMiPuesto());
		e.addJugador(j5.getApellidoYNombre(), j5.getDni(), j5.getMiPuesto());
		e.addJugador(j6.getApellidoYNombre(), j6.getDni(), j6.getMiPuesto());
		assertEquals(6,e.getCantidadDeJugadores());
		
		e.addJugador(j7.getApellidoYNombre(), j7.getDni(), j7.getMiPuesto());
		assertEquals(6,e.getCantidadDeJugadores());
		

	}
	
	@Test
	void testEquipo_OrdenDeJugadores() throws ExceptionPersona{
		Jugador j1 = new Jugador("Luis","12456789",Puesto.ARQUERO);
		Jugador j2 = new Jugador("Carlos","987654321",Puesto.DEFENSOR);
		Jugador j3 = new Jugador("Alberto","65434321",Puesto.DELANTERO);
		
		Equipo e = new Equipo("Yupanqui Sur");
		
		e.addJugador(j1.getApellidoYNombre(), j1.getDni(), j1.getMiPuesto());		
		e.addJugador(j2.getApellidoYNombre(), j2.getDni(), j2.getMiPuesto());
		e.addJugador(j3.getApellidoYNombre(), j3.getDni(), j3.getMiPuesto());
		
		List<Jugador> aux = e.getMisJugadores();
		
		assertEquals(3,aux.size());
		
		assertEquals(j3,aux.get(0));
		assertEquals(j2,aux.get(1));
		assertEquals(j1,aux.get(2));
		
		
	}
	
	@Test
	void testEquipo_PuestoDeJugadores() throws ExceptionPersona{
		Jugador j1 = new Jugador("Luis","12456789",Puesto.ARQUERO);
		Jugador j2 = new Jugador("Carlos","987654321",Puesto.DEFENSOR);
		Jugador j3 = new Jugador("Alberto","65434321",Puesto.DELANTERO);
		Jugador j4 = new Jugador("Ernesto","45346789",Puesto.ARQUERO);
		Jugador j5 = new Jugador("Abel","987654321",Puesto.DEFENSOR);
		Jugador j6 = new Jugador("Anibal","987654321",Puesto.DEFENSOR);
		
		Equipo e = new Equipo("Yupanqui Sur");
		
		e.addJugador(j1.getApellidoYNombre(), j1.getDni(), j1.getMiPuesto());		
		e.addJugador(j2.getApellidoYNombre(), j2.getDni(), j2.getMiPuesto());
		e.addJugador(j3.getApellidoYNombre(), j3.getDni(), j3.getMiPuesto());
		e.addJugador(j4.getApellidoYNombre(), j4.getDni(), j4.getMiPuesto());
		
		List<Jugador> aux = e.getJugadores(Puesto.ARQUERO);
		
		assertEquals(2,aux.size());
		assertEquals(j4,aux.get(0));
		assertEquals(j1,aux.get(1));
		
		e.addJugador(j5.getApellidoYNombre(), j5.getDni(), j5.getMiPuesto());
		e.addJugador(j6.getApellidoYNombre(), j6.getDni(), j6.getMiPuesto());
		
		aux = e.getJugadores(Puesto.DEFENSOR);
		
		assertEquals(3,aux.size());
		assertEquals(j5,aux.get(0));
		assertEquals(j6,aux.get(1));
		assertEquals(j2,aux.get(2));
		
	}
	
	@Test
	void testEquipo_NombreDeJugadores() throws ExceptionPersona{
		Jugador j1 = new Jugador("Luis","12456789",Puesto.ARQUERO);
		Jugador j2 = new Jugador("Carlos","987654321",Puesto.DEFENSOR);
		Jugador j3 = new Jugador("Alberto","65434321",Puesto.DELANTERO);
		Jugador j4 = new Jugador("Ernesto","45346789",Puesto.ARQUERO);
		Jugador j5 = new Jugador("Abel","987654321",Puesto.DEFENSOR);
		Jugador j6 = new Jugador("Anibal","987654321",Puesto.DEFENSOR);
		
		Equipo e = new Equipo("Yupanqui Sur");
		
		e.addJugador(j1.getApellidoYNombre(), j1.getDni(), j1.getMiPuesto());		
		e.addJugador(j2.getApellidoYNombre(), j2.getDni(), j2.getMiPuesto());
		e.addJugador(j3.getApellidoYNombre(), j3.getDni(), j3.getMiPuesto());
		e.addJugador(j4.getApellidoYNombre(), j4.getDni(), j4.getMiPuesto());
		e.addJugador(j5.getApellidoYNombre(), j5.getDni(), j5.getMiPuesto());
		e.addJugador(j6.getApellidoYNombre(), j6.getDni(), j6.getMiPuesto());
		
		List<Jugador> aux = e.getJugadores("e");
		
		assertEquals(3,aux.size());
		assertEquals(j5,aux.get(0));
		assertEquals(j3,aux.get(1));
		assertEquals(j4,aux.get(2));
		
		aux = e.getJugadores("ib");
		
		assertEquals(1,aux.size());
		assertEquals(j6,aux.get(0));
		
	}
	
	@Test
	void testEquipo_Resumen() throws ExceptionPersona{
		Equipo e = new Equipo("Yupanqui Sur");
		
		Jugador j1 = new Jugador("Luis","12456789",Puesto.ARQUERO);
		Jugador j2 = new Jugador("Carlos","987654321",Puesto.DEFENSOR);
		Jugador j3 = new Jugador("Alberto","65434321",Puesto.DELANTERO);
		Jugador j4 = new Jugador("Ernesto","45346789",Puesto.ARQUERO);
		Jugador j5 = new Jugador("Abel","987654321",Puesto.DEFENSOR);
		Jugador j6 = new Jugador("Anibal","987654321",Puesto.DEFENSOR);
		
		assertEquals("Resumen Equipo: 0 Arqueros - 0 Defensores - 0 Delanteros",e.toString());
		
		e.addJugador(j1.getApellidoYNombre(), j1.getDni(), j1.getMiPuesto());		
		e.addJugador(j2.getApellidoYNombre(), j2.getDni(), j2.getMiPuesto());
		e.addJugador(j3.getApellidoYNombre(), j3.getDni(), j3.getMiPuesto());
		
		assertEquals("Resumen Equipo: 1 Arqueros - 1 Defensores - 1 Delanteros",e.toString());
		
		e.addJugador(j4.getApellidoYNombre(), j4.getDni(), j4.getMiPuesto());
		e.addJugador(j5.getApellidoYNombre(), j5.getDni(), j5.getMiPuesto());
		e.addJugador(j6.getApellidoYNombre(), j6.getDni(), j6.getMiPuesto());
				
		assertEquals("Resumen Equipo: 2 Arqueros - 3 Defensores - 1 Delanteros",e.toString());
	}
	
}


