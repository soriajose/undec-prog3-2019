package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dominio.Aerolinea;
import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

class TestAerolineas {
	
	@Test
	void factoryAerolinea_todoLosAtributos_instanciaIncorrecta() {
		
		Assertions.assertThrows(ExceptionNulo.class, ()-> Aerolinea.factoryAerolinea(null, "Qatar Airways"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Aerolinea.factoryAerolinea(2001, null));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Aerolinea.factoryAerolinea(2001, ""));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Aerolinea.factoryAerolinea(null, null));
		
		
	}

	
	@Test
	void testAerolinea_todosLosAtributos_instanciaCorrecta() throws ExceptionNulo {
		
		Aerolinea aerolinea = Aerolinea.factoryAerolinea(2001, "Qatar Airways");
		
	}
	
	
	
}
