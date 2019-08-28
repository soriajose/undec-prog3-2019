package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dominio.Piloto;
import excepciones.ExceptionNulo;


class TestPiloto {

	@Test
	void factoryPiloto_todosLosAtributos_instanciaIncorrecta() {
		
		
		Assertions.assertThrows(ExceptionNulo.class, ()-> Piloto.factoryPiloto(null, "Soria", "Jose", "39300672", LocalDate.of(1996, 8, 16)));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Piloto.factoryPiloto(5001, null, "Jose", "39300672", LocalDate.of(1996, 8, 16)));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Piloto.factoryPiloto(5001, "Soria", "", "39300672", LocalDate.of(1996, 8, 16)));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Piloto.factoryPiloto(5001, "Soria", "Jose", null, LocalDate.of(1996, 8, 16)));
		Assertions.assertThrows(ExceptionNulo.class, ()-> Piloto.factoryPiloto(5001, "Soria", "Jose", "39300672", null));
		
		
	}

	@Test
	void factoryPiloto_todosLosAtributos_instanciaCorrecta() throws ExceptionNulo {
		
		Piloto piloto = Piloto.factoryPiloto(5001, "Soria", "Jose", "39300672", LocalDate.of(1996, 8, 16));
		assertNotNull(piloto);
		
	}
	
	
}
