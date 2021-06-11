package io.maher.main.departments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository deptRepo;
	
	public DepartmentService() {
	}
	
	public List<Department> getAllDepartments() {
		List<Department> departments = new ArrayList<Department>();
		for( Department dept : deptRepo.findAll() ) {
			departments.add(dept);
		}
		return departments;
	}
	
	public Department getDepartment(String deptId) {
		return deptRepo.findById(deptId).orElse(null);
	}
	
	public void addDepartment(Department dept) {
		deptRepo.save(dept);
	}
	
	public void updateDepartment(String deptId, Department dept) {
		deptRepo.save(dept);
	}

	public void deleteDepartment(String deptId) {
		deptRepo.deleteById(deptId);
	}
}
