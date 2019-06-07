package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dominio.Ciudad;
import dominio.Piloto;
import excepciones.ExceptionNulo;

class TestCiudad {

	@Test
	void factoryCiudad_atributosCorrectos_instanciaCorrecta() throws ExceptionNulo {
		
		Ciudad miCiudad = Ciudad.factoryCiudad(101, "Chilecito", "5360");
		assertNotNull(miCiudad);
		
		Ciudad miCiudad2 = Ciudad.factoryCiudad(102, "Cordoba", "5010");
		assertNotNull(miCiudad2);
	
		Ciudad miCiudad3 = Ciudad.factoryCiudad(103, "Buenos Aires", "1010");
		assertNotNull(miCiudad3);
	
	
	}
	
	@Test
	void factoryCiudad_atributosIncorrectos_instanciaIncorrecta() throws ExceptionNulo {
		
		Assertions.assertThrows(ExceptionNulo.class, ()-> Ciudad.factoryCiudad(null, "Chilecito", "5360"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Ciudad.factoryCiudad(102, null, "5010"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Ciudad.factoryCiudad(103, "Buenos Aires", null));
	
	
	}

	
	
}
