package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import dominio.Asiento;
import dominio.Avion;

class TestAvion {

	@Test
	void test_Avion() {
		
		Asiento asiento1 = new Asiento(1, "A1");
		Asiento asiento2 = new Asiento(2, "A2");
		Asiento asiento3 = new Asiento(3, "A3");
		Asiento asiento4 = new Asiento(4, "A4");
		Asiento asiento5 = new Asiento(5, "B1");
		Asiento asiento6 = new Asiento(6, "B2");		
		
		Avion avion = new Avion(1001, "BOEING 737-800", "N785AN");
		
		assertEquals(true, avion.agregarAsiento(asiento1));
		assertEquals("AVION: BOEING 737-800 - ID: 1001 - MATRICULA: N785AN (1 asiento)", avion.getResumenAvion());
		
		assertEquals(true, avion.agregarAsiento(asiento2));

		assertEquals(true, avion.agregarAsiento(asiento3));
		assertEquals(true, avion.agregarAsiento(asiento4));
		assertEquals("AVION: BOEING 737-800 - ID: 1001 - MATRICULA: N785AN (4 asientos)", avion.getResumenAvion());
		

		assertEquals(true, avion.agregarAsiento(asiento5));
		assertEquals(true, avion.agregarAsiento(asiento6));
		assertEquals(true, avion.agregarAsiento(asiento2));
		assertEquals(true, avion.agregarAsiento(asiento3));
		assertEquals(true, avion.agregarAsiento(asiento4));
		
		assertEquals("AVION: BOEING 737-800 - ID: 1001 - MATRICULA: N785AN (6 asientos)", avion.getResumenAvion());
		
		
		
		
	}

}
