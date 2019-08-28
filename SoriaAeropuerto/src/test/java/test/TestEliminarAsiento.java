package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Asiento;
import dominio.Avion;
import dominio.CargarAsiento;
import dominio.ConsultarAsiento;
import dominio.EliminarAsiento;
import excepciones.ExceptionNulo;


class TestEliminarAsiento {

	@Test
	void testAsiento_elimnarAsiento_asientoEspecifico() throws ExceptionNulo {
			
		Avion avion = Avion.factoryAvion(53, "A380", "QA5A");
		
		Asiento asiento1 = Asiento.factoryAsiento(8001, "B30");
		Asiento asiento2 = Asiento.factoryAsiento(8002, "B31");
		Asiento asiento3 = Asiento.factoryAsiento(8003, "B32");
		Asiento asiento4 = Asiento.factoryAsiento(8004, "B34");
		Asiento asiento5 = Asiento.factoryAsiento(8005, "B35");
		
		
		assertEquals(true, CargarAsiento.cargarAsientosAlAvion(avion, asiento1));
		assertEquals(true, CargarAsiento.cargarAsientosAlAvion(avion, asiento2));
		assertEquals(true, CargarAsiento.cargarAsientosAlAvion(avion, asiento3));
		assertEquals(true, CargarAsiento.cargarAsientosAlAvion(avion, asiento4));
		assertEquals(true, CargarAsiento.cargarAsientosAlAvion(avion, asiento5));
		
		assertEquals(5, ConsultarAsiento.getCantidadAsientos(avion));
		
		assertEquals(true, EliminarAsiento.eliminarAsientoPorID(avion, asiento1.getIdAsiento()));
		assertEquals(true, EliminarAsiento.eliminarAsientoPorID(avion, asiento2.getIdAsiento()));
		
		assertEquals(3, ConsultarAsiento.getCantidadAsientos(avion));
	
	}

}
