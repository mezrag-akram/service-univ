package dz.becharuniv.etud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.becharuniv.etud.model.Studant;
import dz.becharuniv.etud.repository.Studant_Repos;


//bach nrado had classe service
@Service
public class Studant_CDB {

	//create instance man studant_repos
	@Autowired
	private Studant_Repos std_rp;
	
	
	//bach nba3da n3aytolha f studant tagbad lina kamal wach kayan f liste
	public List<Studant> getallstudants(String id){
		
		 List<Studant> Studants = new ArrayList<>();
		 std_rp.findByDepartemantId(id)
		 .forEach(Studants::add);
	return Studants;
	}
	
	//bach n3aytolha f studants tmadlina studant wahad 
	public Studant getstudant(String id) {
	  return std_rp.findOne(id);
	}

	//baryin f had methode nzido studant
	public void addstudant(Studant std) {
		std_rp.save(std);
	}

	//  update iny studant using id
	public void updatestudant(Studant std) {
		std_rp.save(std);
		}

	//delete any studant using id
	public void deletestudant(String id) {
		std_rp.delete(id);
	}
	
}
