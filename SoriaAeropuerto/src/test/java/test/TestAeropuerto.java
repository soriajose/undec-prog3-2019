package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAeropuerto {

	@Test
	void test_Aeropuerto() {
		
		
		Aeropuerto aeropuerto = new Aeropuerto(2501, "Jorge Newbery", new Ciudad(2501, "Buenos Aires", "1706"), "SABE");
		
		assertEquals("[0001 - SABE] JORGE NEWBERY - BUENOS AIRES (CP: 1706)", aeropuerto.getResumenAeropuerto());
		
	}

}
