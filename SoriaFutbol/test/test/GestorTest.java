package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Gestor;

class GestorTest {

	@Test
	void testSingleton() {
		Gestor g1 = Gestor.getInstancia();
		Gestor g2 = Gestor.getInstancia();
		assertEquals(true,g1==g2);
		assertEquals(true,g1.equals(g2));
	}

	
	
	
	
}
