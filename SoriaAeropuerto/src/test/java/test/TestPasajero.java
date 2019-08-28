package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dominio.Pasajero;
import excepciones.ExceptionCantidadDigitos;
import excepciones.ExceptionNulo;


class TestPasajero {

	@Test
	void factoryPasajero_todosLosAtributos_instanciaIncorrecta() throws ExceptionNulo{
		
		Assertions.assertThrows(ExceptionNulo.class, ()-> Pasajero.factoryPasajero(null, "20393006723", "Soria", "Jose", "3825520391"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Pasajero.factoryPasajero(3001, null, "Soria", "Jose", "3825520391"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Pasajero.factoryPasajero(3001, "20393006723", null, "Jose", "3825520391"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Pasajero.factoryPasajero(3001, "20393006723", "Soria", null, "3825520391"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Pasajero.factoryPasajero(null, null, null, null, null));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Pasajero.factoryPasajero(3001, "", "Soria", "Jose", "3825520391"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Pasajero.factoryPasajero(3001, "20393006723", "", "Jose", "3825520391"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Pasajero.factoryPasajero(3001, "20393006723", "Soria", "", "3825520391"));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Pasajero.factoryPasajero(3001, "20393006723", "Soria", "Jose", ""));
		
	}

	
	@Test
	void factoryPasajero_atributoCUILIncorrecto_instanciaIncorrecta() throws ExceptionCantidadDigitos{
		
		Assertions.assertThrows(ExceptionCantidadDigitos.class, ()-> Pasajero.factoryPasajero(3001, "2039300672300", "Soria", "Jose", "3825520391"));
		
	}
	
	
	@Test
	void factoryPasajero_todosLosAtributos_instanciaCorrecta() throws ExceptionNulo, ExceptionCantidadDigitos{
		
		Pasajero pasajero = Pasajero.factoryPasajero(3001, "2039300672", "Soria", "Jose", "3825520391");
		assertNotNull(pasajero);
		
	}
	
	
	
}
