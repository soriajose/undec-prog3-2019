package test;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.Factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dominio.Ciudad;
import excepciones.ExceptionNulo;

class TestCiudad {

	@Test
	void testFactoryCiudad_ciudadConTodosLosAtributos_instanciaIncorrecta() throws ExceptionNulo{
		
		Assertions.assertThrows(ExceptionNulo.class, ()-> Ciudad.factoryCiudad(null, "Chilecito", "5360"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Ciudad.factoryCiudad(1001, null, "5360"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Ciudad.factoryCiudad(1001, "Chilecito", null));
		
		
	}

	
	@Test
	void testFactoryCiudad_ciudadConTodosLosAtributos_instanciaCorrecta() throws ExceptionNulo {
		
		Ciudad miCiudad = Ciudad.factoryCiudad(1001, "Chilecito", "5360");
		assertNotNull(miCiudad);
		
		
	}
	
	
}
