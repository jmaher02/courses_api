package io.maher.main.departments;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Department {
	
	@Id
	private String nameId;
	private String name;
	private int requirements;
	private String description;
	
	public Department( ) {
		super();
	}
	
	public Department(String nameId, String name, int requirements, String description) {
		super();
		this.nameId = nameId;
		this.name = name;
		this.requirements = requirements;
		this.description = description;
	}
	
	public String getId() {
		return nameId;
	}
	public void setId(String nameId) {
		this.nameId = nameId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRequirements() {
		return requirements;
	}
	public void setRequirements(int requirements) {
		this.requirements = requirements;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
