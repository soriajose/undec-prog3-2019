package ar.edu.undec;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ar.edu.undec.crud.PilotoCrud;
import ar.edu.undec.modelo.Piloto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataApplicationTests {

	@Autowired
	PilotoCrud pilotoCrud;
	
	@Test
	public void guardarPiloto() {
		Piloto elPiloto=new Piloto();
		elPiloto.setIdPiloto(1);
		elPiloto.setNombre("Spring Data");
		
		assertNotNull(pilotoCrud.save(elPiloto));
	}
	
	
	@Test
	public void devolverPiloto() {
		Piloto algunPiloto=pilotoCrud.findById(2).get();
		
		assertEquals("Spring", algunPiloto.getNombre());
	}

}
