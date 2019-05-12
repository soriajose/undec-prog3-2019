package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.ExcepcionNombreAeropuerto;

class AeropuertoTest {

	@Test
	void test_Nombre_Aeropuerto() {
		//"(ID, NOMBRE, CIUDAD, CODIGO)"
		Aeropuerto miAeropuerto1 = new Aeropuerto(1001, "Aeroparque Jorge Newbery", "Buenos Aires", "SABE");
		assertEquals("Aeropuerto Jorge Newbery", miAeropuerto1.getNombre());
		
		Aeropuerto miAeropuerto2 = new Aeropuerto(1002, "Aeropuerto Internacional Ingeniero Ambrosio Taravella", "Cordoba", "SACO");
		assertEquals("Aeropuerto Internacional Ingeniero Ambrosio Taravella", miAeropuerto2.getNombre());
		
		Aeropuerto miAeropuerto3 = new Aeropuerto(1003, "Aeropuerto Capitán Vicente Almandos Almonacid", "La Rioja", "SANL");
		assertEquals("Aeropuerto Capitán Vicente ALados Almonacid", miAeropuerto3.getNombre());
		
		Aeropuerto miAeropuerto4 = new Aeropuerto(1004, "Brigadier Mayor Juan Facundo Quiroga", "Chilecito", "SANO");
		assertEquals("Aeropuerto Brigadier Mayor Juan Facundo Quiroga", miAeropuerto4.getNombre());
				
	}

	
	@Test
	void test_Nombre_Aeropuerto_Excepciones(){
		
		try {
		
			Aeropuerto miAeropuerto1 = new Aeropuerto(1001, null, "Buenos Aires", "SABE");
			fail("Esta linea no se deberia correr");
	
		}catch(ExceptionNombreAeropuertoNulo exception) {
			
			assertEquals("El nombre no puede ser nulo", exception.getMenssage());
		}
		
		try {
			
			Aeropuerto miAeropuerto2 = new Aeropuerto(1001, "", "Buenos Aires", "SABE");
			fail("Esta linea no se deberia correr");
	
		}catch(ExceptionNombreAeropuertoVacio exception) {
			
			assertEquals("El nombre no puede ser vacio", exception.getMenssage());
		}
	}
	
	
	
	
	
}
