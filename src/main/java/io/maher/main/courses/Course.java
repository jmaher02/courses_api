package io.maher.main.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.maher.main.departments.Department;

@Entity 
public class Course {
	
	@Id
	private String courseId;
	private String name;
	private String description;
	
	@ManyToOne
	private Department department;
	
	public Course( ) {
		super();
	}
	
	public Course(String courseId, String name, String description, String deptId) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.description = description;
		this.department = new Department(deptId, "", 0, "");
	}
	
	public String getId() {
		return courseId;
	}
	public void setId(String courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
