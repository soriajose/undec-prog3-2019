package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dominio.Piloto;
import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

class TestPiloto {

	@Test
	void factoryPiloto_atributosPiloto_instanciaPiloto() throws ExceptionNulo {
		
		Piloto miPiloto = Piloto.factoryPiloto(1231, "Soria", "Jose", "40300672", LocalDate.of(1996, 8, 16));
		assertNotNull(miPiloto);
	
		Piloto miPiloto2 = Piloto.factoryPiloto(1231, "Fajardo", "Hugo", "30123543", LocalDate.of(1980, 4, 12));
		assertNotNull(miPiloto2);
	
		Piloto miPiloto3 = Piloto.factoryPiloto(1231, "Ruitti", "Javier", "35543123", LocalDate.of(1985, 6, 28));
		assertNotNull(miPiloto3);
		
	}
	
	@Test
	void factoryPiloto_atributosPiloto_instanciaIncorrecta() throws ExceptionNulo {
		
		Assertions.assertThrows(ExceptionNulo.class, ()-> Piloto.factoryPiloto(null, "Soria", "Jose", "40300672", LocalDate.of(1996, 8, 16)));
		
		Assertions.assertThrows(ExceptionNulo.class, ()-> Piloto.factoryPiloto(4321, "Fajardo", null, null, LocalDate.of(1980, 4, 12)));
	
		Assertions.assertThrows(ExceptionNulo.class, ()-> Piloto.factoryPiloto(4322, null, "Javier", "35543123", LocalDate.of(1985, 6, 28)));
	
		
	}
	
	@Test
	void getResumenPiloto_atributosPiloto_atributosCorrectos() throws ExceptionNulo{
	
		
		
		Piloto miPiloto = Piloto.factoryPiloto(1231, "Soria", "Jose", "40300672", LocalDate.of(1996, 8, 16));
		assertEquals("ID: 1231 - Apellido: Soria - Nombre: Jose - DNI: 40300672 - Fecha de Nacimiento: 1996-08-16", miPiloto.getResumenPiloto());
		
		Piloto miPiloto2 = Piloto.factoryPiloto(1232, "Fajardo", "Hugo", "30123543", LocalDate.of(1980, 4, 12));
		assertEquals("ID: 1232 - Apellido: Fajardo - Nombre: Hugo - DNI: 30123543 - Fecha de Nacimiento: 1980-04-12", miPiloto2.getResumenPiloto());
		
		Piloto miPiloto3 = Piloto.factoryPiloto(1233, "Ruitti", "Javier", "35543123", LocalDate.of(1985, 6, 28));
		assertEquals("ID: 1233 - Apellido: Ruitti - Nombre: Javier - DNI: 35543123 - Fecha de Nacimiento: 1985-06-28", miPiloto3.getResumenPiloto());
		
	
	}
}

