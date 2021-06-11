package io.maher.main.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByDepartmentNameId(String deptId);
}
