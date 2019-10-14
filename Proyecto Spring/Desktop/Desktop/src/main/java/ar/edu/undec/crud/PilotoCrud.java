package ar.edu.undec.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.undec.modelo.Piloto;

@Repository
// info acerca de anotacion @Repository -> https://www.baeldung.com/spring-component-repository-service
public interface PilotoCrud extends CrudRepository<Piloto, Integer> {

}
