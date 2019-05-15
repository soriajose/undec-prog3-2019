package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Asiento;

class TestAsiento {

	@Test
	void test_Atributos_Asientos() {
	
		//(IdAsiento, numeroAsiento)
		Asiento asiento1 = new Asiento(10, "A32");
		Asiento asiento2 = new Asiento(11, "A33");
		Asiento asiento3 = new Asiento(12, "A34");
		
		assertEquals("ID de asiento: 10 - Numero Asiento: A32", asiento1.getResumenAsiento());
		assertEquals("ID de asiento: 11 - Numero Asiento: A33", asiento2.getResumenAsiento());
		assertEquals("ID de asiento: 12 - Numero Asiento: A34", asiento3.getResumenAsiento());
	
		
	}

}
