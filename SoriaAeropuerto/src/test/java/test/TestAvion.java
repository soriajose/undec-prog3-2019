package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dominio.Avion;
import excepciones.ExceptionNulo;


class TestAvion {

	@Test
	void factoryAvion_todosLosAtributos_instanciaIncorrecta() throws ExceptionNulo{
			
		Assertions.assertThrows(ExceptionNulo.class, ()-> Avion.factoryAvion(null, "A380", "QA5A"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Avion.factoryAvion(53, null, "QA5A"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Avion.factoryAvion(53, "A380", null));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Avion.factoryAvion(53, "", "QA5A"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Avion.factoryAvion(53, "A380", ""));
		
		
	}

	
	@Test
	void factoryAvion_todosLosAtributos_instanciaCorrecta() throws ExceptionNulo{
		
		Avion avion = Avion.factoryAvion(53, "A380", "QA5A");
		assertNotNull(avion);
		
	}
	
	
}
