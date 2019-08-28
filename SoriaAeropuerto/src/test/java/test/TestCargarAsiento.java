package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Asiento;
import dominio.Avion;
import dominio.CargarAsiento;
import excepciones.ExceptionNulo;

class TestCargarAsiento {

	@Test
	void cargarAsiento_metodoCargarAsientoAlAvion_cargaCorrecta() throws ExceptionNulo {
		
		Avion avion = Avion.factoryAvion(53, "A380", "QA5A");
		
		Asiento asiento1 = Asiento.factoryAsiento(8001, "B30");
		Asiento asiento2 = Asiento.factoryAsiento(8002, "B31");
		Asiento asiento3 = Asiento.factoryAsiento(8003, "B32");
		
		
		assertEquals(true, CargarAsiento.cargarAsientosAlAvion(avion, asiento1));
		assertEquals(true, CargarAsiento.cargarAsientosAlAvion(avion, asiento2));
		assertEquals(true, CargarAsiento.cargarAsientosAlAvion(avion, asiento3));
		
		
		
	}

}
