package dz.becharuniv.depar.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dz.becharuniv.depar.model.Departemant;


@RestController
public class Departemant_info {

	//bach ncriyiw instance man sevice 
		@Autowired
		private Departemant_CDB sevice;
		
		//default
		//to get all deps
		@RequestMapping("/deps")
		public List<Departemant> getall() {	
			return sevice.getalldeps();
	}
		
		//baryin n3ayto dep wahad b isti3mal id
		@RequestMapping("/deps/{id}")
		public Departemant getallinfo(@PathVariable String id) {
			return sevice.getdep(id);
		} 
		
		// spicifay ; baryin ndiro post l dep f liste ma3na nzido dep f liste nasta3mlo post
		@RequestMapping(method=RequestMethod.POST , value="/deps")
		public void addstudant(@RequestBody Departemant top) {
			sevice.adddep(top);
		}
		
		
		// spicifay ; baryin ndiro put ya3ni update 
			@RequestMapping(method=RequestMethod.PUT , value="/deps")
			public void updatestudant(@RequestBody Departemant top) {
				sevice.updatedep(top);
			}
			
			// spicifay ; baryin ndiro delete
					@RequestMapping(method=RequestMethod.DELETE , value="/deps/{id}")
					public void deletestudant(@PathVariable String id) {
						sevice.deletedep(id);
					}
	
}
