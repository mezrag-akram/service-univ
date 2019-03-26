package dz.becharuniv.depar.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.becharuniv.depar.model.Departemant;
import dz.becharuniv.depar.repository.Departemant_Repos;


//bach nrado had classe service
@Service
public class Departemant_CDB {

	//create instance man Departemant_repos
	@Autowired
	private Departemant_Repos dep;
	
	
	// n3aytolha f departemants tagbad lina kamal wach kayan f liste
	public List<Departemant> getalldeps(){
		
		 List<Departemant> deps = new ArrayList<>();
		dep.findAll().forEach(deps::add);
	return deps;
	}
	
	//bach n3aytolha f departemants tmadlina departemant wahad 
	public Departemant getdep(String id) {
	  return dep.findOne(id);
	}

	//baryin f had methode nzido departemant
	public void adddep(Departemant std) {
		dep.save(std);
	}

	//  update any departemant using id
	public void updatedep(Departemant std) {
		dep.save(std);
		}

	//delete any departemant using id
	public void deletedep(String id) {
		dep.delete(id);
	}
	
}
