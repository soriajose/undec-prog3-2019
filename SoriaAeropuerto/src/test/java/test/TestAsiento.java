package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dominio.Asiento;
import excepciones.ExceptionNulo;


class TestAsiento {

	@Test
	void factoryAsiento_todosLosAtributos_instanciaIncorrecta() throws ExceptionNulo{
		
		
		Assertions.assertThrows(ExceptionNulo.class, ()-> Asiento.factoryAsiento(null, "B30"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Asiento.factoryAsiento(8001, null));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Asiento.factoryAsiento(8001, ""));
		
		
		
	}

	
	@Test
	void factoryAsiento_todosLosAtributos_instanciaCorrecta() throws ExceptionNulo{
		
		Asiento asiento = Asiento.factoryAsiento(8001, "B30");
		assertNotNull(asiento);
	}
	
}
