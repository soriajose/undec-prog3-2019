package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestVuelo {

	@Test
	void test_Resumen_Vuelo() {
		
		//Primer vuelo
		Aeropuerto aeropuerto1 = new Aeropuerto(2501, "Aeropuerto Internacional Jorge Newbery", new Ciudad(101, "Buenos Aires", "1706"), "SABE");
		Aeropuerto aeropuerto2 = new Aeropuerto(2502, "Aeropuerto Internacional Ingeniero Ambrosio Taravella", new Ciudad(102, "Cordoba", "1707"), "SACO");
		Aerolinea aerolinea1 = new Aerolinea(1234, "Fly Emirates");
		Avion avion1 = new Avion(1001, "BOEING 737-800", "N785AN");
		
		Vuelo vuelo1 = new Vuelo("VBC47", aeropuerto1, LocalTime.of(12, 00), aeropuerto2, LocalTime.of(15, 30), aerolinea1, pilotos = new ArrayList<Piloto>(), avion1, pasajeros = new ArrayList<Pasajero>());
		assertEquals("Codigo de vuelo: VBC47 - Salida: Aeropuerto Internacional Jorge Newbery - Hora de Salida: 12:00 - Hora de Arribo: 15:30 - Aerolinea: Fly Emirates - Pilotos: 2 - Pasajeros: 10", vuelo1.getResumenVuelo());
		
		
		
		//Segundo vuelo
		Aeropuerto aeropuerto3 = new Aeropuerto(2503, "Aeropuerto Brigadier Mayor Juan Facundo Quiroga", new Ciudad(103, "Chilecito", "5360"), "SANO");
		Aerolinea aerolinea2 = new Aerolinea(1235, "Qatar Airways");
		Avion avion2 = new Avion(1002, "AIRBUS A350-1000", "N786AC");
		
		Vuelo vuelo1 = new Vuelo("VCC48", aeropuerto2, LocalTime.of(15, 30), aeropuerto3, LocalTime.of(17, 30), aerolinea2, pilotos = new ArrayList<Piloto>(), avion2, pasajeros = new ArrayList<Pasajero>());
		assertEquals("Codigo de vuelo: VCC48 - Salida: Aeropuerto Internacionl Ingeniero Ambrosio Taravella - Hora de Salida: 12:00 - Hora de Arribo: 15:30 - Aerolinea: Qatar Airways - Pilotos: 2 - Pasajeros: 12", vuelo1.getResumenVuelo());
		
		
	}

}
