package sba.sms.services;

import java.util.ArrayList;
import java.util.List;

import sba.sms.dao.StudentI;
import sba.sms.models.Course;
import sba.sms.models.Student;

public class StudentService implements StudentI {
	private static List<Student> students = new ArrayList<Student>();

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public void createStudent(Student student) {
		students.add(student);
		
	}

	@Override
	public Student getStudentByEmail(String email) {
		for (int i = 0; i < students.size(); i++) {
			Student st = students.get(i);
            if (st.getEmail().equals(email)) {
            	return st;
            }
		}
		
		return null;
	}

	@Override
	public void registerStudentToCourse(String email, int courseId) {
		Student st = getStudentByEmail(email);
		if (st != null && !st.hasCourseById(courseId)) {
			CourseService courseService = new CourseService();
			Course course = courseService.getCourseById(courseId);
			st.addCourse(course);
		}
		
	}

	@Override
	public List<Course> getStudentCourses(String email) {
		Student st = getStudentByEmail(email);
		if (st != null) {
			return st.getCourses();
		}
		
		return new ArrayList<Course>();
	}

	@Override
	public boolean validateStudent(String email, String password) {
		Student st = getStudentByEmail(email);
		if (st != null && st.getPassword().equals(password)) {
			return true;
		}
		
		return false;
	}

}
