package io.maher.main.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public CourseService() {
	}
	
	public List<Course> getAllCourses(String deptId) {
		List<Course> courses = new ArrayList<Course>();
		for( Course course : courseRepo.findByDepartmentNameId(deptId) ) {
			courses.add(course);
		}
		return courses;
	}
	
	public Course getCourse(String courseId) {
		return courseRepo.findById(courseId).orElse(null);
	}
	
	public void addCourse(Course course) {
		courseRepo.save(course);
	}
	
	public void updateCourse(Course course) {
		courseRepo.save(course);
	}

	public void deleteCourse(String course) {
		courseRepo.deleteById(course);
	}
}
