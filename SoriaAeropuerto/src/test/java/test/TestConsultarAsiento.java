package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Asiento;
import dominio.Avion;
import dominio.CargarAsiento;
import dominio.ConsultarAsiento;
import excepciones.ExceptionNulo;


class TestConsultarAsiento {

	@Test
	void testAsiento_consultarCantidad_asientosDeUnAvion() throws ExceptionNulo {
		
		Avion avion = Avion.factoryAvion(53, "A380", "QA5A");
		
		Asiento asiento1 = Asiento.factoryAsiento(8001, "B30");
		Asiento asiento2 = Asiento.factoryAsiento(8002, "B31");
		Asiento asiento3 = Asiento.factoryAsiento(8003, "B32");
	
		CargarAsiento.cargarAsientosAlAvion(avion, asiento1);
		CargarAsiento.cargarAsientosAlAvion(avion, asiento2);
		CargarAsiento.cargarAsientosAlAvion(avion, asiento3);
		CargarAsiento.cargarAsientosAlAvion(avion, asiento1);
		CargarAsiento.cargarAsientosAlAvion(avion, asiento2);
		

		assertEquals(3, ConsultarAsiento.getCantidadAsientos(avion));
		
		
	}

	@Test
	void testAsiento_consultarAsiento_asientoPorNumero() throws ExceptionNulo {
		
		Avion avion = Avion.factoryAvion(53, "A380", "QA5A");
		
		Asiento asiento1 = Asiento.factoryAsiento(8001, "B30");
		Asiento asiento2 = Asiento.factoryAsiento(8002, "B31");
		Asiento asiento3 = Asiento.factoryAsiento(8003, "B32");
	
		CargarAsiento.cargarAsientosAlAvion(avion, asiento1);
		CargarAsiento.cargarAsientosAlAvion(avion, asiento2);
		CargarAsiento.cargarAsientosAlAvion(avion, asiento3);
		CargarAsiento.cargarAsientosAlAvion(avion, asiento1);
		CargarAsiento.cargarAsientosAlAvion(avion, asiento2);
		
		assertEquals("ID del avion: 53 - Modelo: A380 - Matricula: QA5A - ID Asiento: 8001 - Numero: B30", ConsultarAsiento.getConsultarAsiento(avion, asiento1.getNumeroAsiento()));
		
	}
	
	
}
