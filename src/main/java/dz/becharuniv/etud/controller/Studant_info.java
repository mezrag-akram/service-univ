package dz.becharuniv.etud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dz.becharuniv.depar.model.Departemant;
import dz.becharuniv.etud.model.Studant;


@RestController
public class Studant_info {

	//bach ncriyiw instance man sevice 
		@Autowired
		private Studant_CDB sevice;
		
		//default
		//to get all studants
		@RequestMapping("/deps/{id}/studants")
		public List<Studant> getall(@PathVariable String id) {	
			return sevice.getallstudants(id);
		}
		
		//baryin n3ayto studant wahad b isti3mal id
		@RequestMapping("/deps/{id}/studants/{studantid}")
		public Studant getallinfo(@PathVariable String studantid) {
			return sevice.getstudant(studantid);
		} 
		
		// spicifay ; baryin ndiro post l studant f liste ma3na nzido studant f liste nasta3mlo post
		@RequestMapping(method=RequestMethod.POST , value="/deps/{id}/studants")
		public void addstudant(@RequestBody Studant std,@PathVariable String id) {
			std.setDepartemant(new Departemant(id,"",""));
			sevice.addstudant(std);
		}
		
		
		// spicifay ; baryin ndiro put ya3ni update 
			@RequestMapping(method=RequestMethod.PUT , value="/deps/{id}/studants/{studantid}")
			public void updatestudant(@RequestBody Studant std,@PathVariable String id) {
				std.setDepartemant(new Departemant(id,"",""));
				sevice.updatestudant(std);
			}
			
			// spicifay ; baryin ndiro put ya3ni update 
					@RequestMapping(method=RequestMethod.DELETE ,  value="/deps/{id}/studants/{studantid}")
					public void deletestudant(@PathVariable String studantid) {
						sevice.deletestudant(studantid);
					}
	
}
