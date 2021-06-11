package io.maher.main.departments;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/departments")
	public List<Department> getAllDepartments () {
		return departmentService.getAllDepartments();
	}
	
	@RequestMapping("/departments/{deptId}")
	public Department getDepartment(@PathVariable String deptId) {
		return departmentService.getDepartment(deptId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/departments")
	public void addDepartment(@RequestBody Department dept ) {
		departmentService.addDepartment(dept);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/departments/{deptId}")
	public void updateDepartment(@PathVariable String deptId, @RequestBody Department dept ) {
		departmentService.updateDepartment(deptId, dept);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/departments/{deptId}")
	public void deleteDepartment(@PathVariable String deptId) {
		departmentService.deleteDepartment(deptId);
	}
}
