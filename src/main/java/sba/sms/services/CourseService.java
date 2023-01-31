package sba.sms.services;

import java.util.ArrayList;
import java.util.List;

import sba.sms.dao.CourseI;
import sba.sms.models.Course;

public class CourseService implements CourseI {
	private static List<Course> courses = new ArrayList<Course>();
	private static int counter = 1;

	@Override
	public void createCourse(Course course) {
		course.setId(counter);
		courses.add(course);
		counter++;
	}

	@Override
	public Course getCourseById(int courseId) {
		for (int i = 0; i < courses.size(); i++) {
			Course c = courses.get(i);
            if (c.getId() == courseId) {
            	return c;
            }
		}
		
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courses;
	}
	
}
