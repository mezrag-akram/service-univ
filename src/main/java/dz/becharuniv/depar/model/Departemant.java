package dz.becharuniv.depar.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departemant {

	@Id
	private String id;
	private String dep_name;
	private String dep_domain;
	
	public Departemant() {
	}
	
	public Departemant(String id, String dn, String dm) {
		this.id = id;
		this.setDep_name(dn);
		this.dep_domain=dm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDep_domain() {
		return dep_domain;
	}

	public void setDep_domain(String dep_domain) {
		this.dep_domain = dep_domain;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
}
