package dz.becharuniv.etud.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import dz.becharuniv.depar.model.Departemant;

@Entity
public class Studant {

	//the premerie key is id
	@Id
	private String id;
	private String firstname;
	private String lastname;
	private String daybirth;
	private String locationbirth;
	private String level;
	
	//this forant key 
	@ManyToOne
	private Departemant departemant;
	
	
	public Studant() {
		
	}
	
	public Studant(String id, String fn, String ln,String db, String lb, String lv ,String dep) {
		this.id = id;
		this.firstname=fn;
		this.lastname=ln;
		this.daybirth=db;
		this.locationbirth=lb;
		this.level=lv;
		this.departemant = new Departemant(dep,"", "");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDaybirth() {
		return daybirth;
	}

	public void setDaybirth(String daybirth) {
		this.daybirth = daybirth;
	}

	public String getLocationbirth() {
		return locationbirth;
	}

	public void setLocationbirth(String locationbirth) {
		this.locationbirth = locationbirth;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Departemant getDepartemant() {
		return departemant;
	}

	public void setDepartemant(Departemant departemant) {
		this.departemant = departemant;
	}
	
	
}
