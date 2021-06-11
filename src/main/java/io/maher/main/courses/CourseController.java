package io.maher.main.courses;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.maher.main.departments.Department;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/departments/{deptId}/courses")
	public List<Course> getAllCourses (@PathVariable String deptId) {
		return courseService.getAllCourses(deptId);
	}
	
	@RequestMapping("/departments/{deptId}/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/departments/{deptId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String deptId ) {
		course.setDepartment(new Department(deptId, "", 0, ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/departments/{deptId}/courses/{courseId}")
	public void updateCourse(@PathVariable String deptId, @PathVariable String courseId, @RequestBody Course course ) {
		course.setDepartment(new Department(deptId, "", 0, ""));
		courseService.updateCourse(course);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/departments/{deptId}/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		courseService.deleteCourse(courseId);
	}
}
