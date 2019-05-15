package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Aeropuerto;
import dominio.Ciudad;
import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

class TestAeropuerto {

	@Test
	void test_Aeropuerto() throws ExceptionNulo, ExceptionVacio {
		
		
		Aeropuerto aeropuerto1 = new Aeropuerto(2501, "Aeropuerto Internacional Jorge Newbery", new Ciudad(101, "Buenos Aires", "1706"), "SABE");
		assertEquals("[2501 - SABE] AEROPUERTO INTERNACIONAL JORGE NEWBERY - BUENOS AIRES (CP: 1706)", aeropuerto1.getResumenAeropuerto());
		
		
		Aeropuerto aeropuerto2 = new Aeropuerto(2502, "Aeropuerto Internacional Ingeniero Ambrosio Taravella", new Ciudad(102, "Cordoba", "1707"), "SACO");
		assertEquals("[2502 - SACO] AEROPUERTO INTERNACIONAL INGENIERO AMBROSIO TARAVELLA - CORDOBA (CP: 1706)", aeropuerto2.getResumenAeropuerto());
		
		
		Aeropuerto aeropuerto3 = new Aeropuerto(2503, "Aeropuerto Brigadier Mayor Juan Facundo Quiroga", new Ciudad(103, "Chilecito", "5360"), "SANO");
		assertEquals("[2503 - SANO] AEROPUERTO BRIGADIER MAYOR JUAN FACUNDO QUIROGA - CHILECITO (CP: 5360)", aeropuerto3.getResumenAeropuerto());
		
		
	}

}
