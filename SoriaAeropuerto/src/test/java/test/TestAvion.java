package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestAvion {

	@Test
	void test_Avion() {
		
		Asiento asiento1 = new Asiento(1, "A1");
		Asiento asiento2 = new Asiento(2, "A2");
		Asiento asiento3 = new Asiento(3, "A3");
		Asiento asiento4 = new Asiento(4, "A4");
		Asiento asiento5 = new Asiento(5, "B1");
		Asiento asiento6 = new Asiento(6, "B2");		
		
		Avion avion = new Avion(10001, "BOEING 737-800", "N785AN");
		
		assert(true,avion.agregarAsiento(asiento1));
		assertEquals("AVION: BOEING 737-800 - ID: 10001 - MATRICULA: N785AN (1 asiento)", avion.getResumenAvion());
		
		assert(true,avion.agregarAsiento(asiento2));
		assert(true,avion.agregarAsiento(asiento3));
		assert(true,avion.agregarAsiento(asiento4));
		
		assertEquals("AVION: BOEING 737-800 - ID: 10001 - MATRICULA: N785AN (4 asientos)", avion.getResumenAvion());
		
		assert(true,avion.agregarAsiento(asiento5));
		assert(true,avion.agregarAsiento(asiento6));
		assert(false,avion.agregarAsiento(asiento2));
		assert(false,avion.agregarAsiento(asiento3));
		assert(false,avion.agregarAsiento(asiento4));
		
		assertEquals("AVION: BOEING 737-800 - ID: 10001 - MATRICULA: N785AN (6 asientos)", avion.getResumenAvion());
		
		
	}

}
