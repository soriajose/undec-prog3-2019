package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Asiento;
import dominio.Asignacion;
import dominio.Pasajero;
import excepciones.ExceptionCantidadIncorrecta;
import excepciones.ExceptionNulo;
import excepciones.ExceptionVacio;

class TestAsignacion {

	@Test
	void test_Atributos_Asignacion() throws ExceptionNulo, ExceptionVacio, ExceptionCantidadIncorrecta {
		
			Pasajero pasajero1 = new Pasajero(1001, "201234561", "Soria", "Jose", "15123456");
			Asiento asiento1 = new Asiento(10, "A32");
			Asignacion asignacion1 = new Asignacion(pasajero1, asiento1, "A321001SJ");
			assertEquals("Pasajero: Soria Jose - Asiento: (10 - A32) - Codigo: A321001SJ", asignacion1.getResumenAsignacion());
			
		
	
			Pasajero pasajero2 = new Pasajero(1002, "30123456783", "Fajardo", "Hugo", "15654321");
			Asiento asiento2 = new Asiento(11, "A33");
			Asignacion asignacion2 = new Asignacion(pasajero2, asiento2, "A331002HF");
			assertEquals("Pasajero: Fajardo Hugo - Asiento: (11 - A33) - Codigo: A331002FH", asignacion2.getResumenAsignacion());
			
			
			Pasajero pasajero3 = new Pasajero(1003, "40123456785", "Ruitti", "Javier", "15653412");
			Asiento asiento3 = new Asiento(12, "A34");
			Asignacion asignacion3 = new Asignacion(pasajero3, asiento3, "A331002HF");
			assertEquals("Pasajero: Ruitti Javier - Asiento: (12 - A34) - Codigo: A341003RJ", asignacion3.getResumenAsignacion());
			
	}
		
	

}
