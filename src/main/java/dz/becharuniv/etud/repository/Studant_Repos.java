package dz.becharuniv.etud.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import dz.becharuniv.etud.model.Studant;

public interface Studant_Repos extends CrudRepository<Studant,String> {

	public List<Studant> findByDepartemantId(String id);
	
}
