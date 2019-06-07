package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dominio.Asiento;
import excepciones.ExceptionNulo;

class TestAsiento {

	@Test
	void factoryAsiento_atributoCorrecto_instanciaCorrecta() throws ExceptionNulo {
		
		Asiento miAsiento = Asiento.asientoFactory(10, "A32");
		assertNotNull(miAsiento);
		
		Asiento miAsiento2 = Asiento.asientoFactory(11, "A33");
		assertNotNull(miAsiento2);
		
		Asiento miAsiento3 = Asiento.asientoFactory(12, "A34");
		assertNotNull(miAsiento3);
		
	}

	
	@Test
	void resumenAsiento_getResumenCorrecto_atributosResumen() throws ExceptionNulo {
		
		Asiento miAsiento = Asiento.asientoFactory(10, "A32");
		assertEquals("ID de asiento: 10 - Numero Asiento: A32", miAsiento.getResumenAsiento());
		
		Asiento miAsiento2 = Asiento.asientoFactory(11, "A33");
		assertEquals("ID de asiento: 11 - Numero Asiento: A33", miAsiento2.getResumenAsiento());
		
		
		Asiento miAsiento3 = Asiento.asientoFactory(12, "A34");
		assertEquals("ID de asiento: 12 - Numero Asiento: A34", miAsiento3.getResumenAsiento());
		
		
		
	}
	
	
}
