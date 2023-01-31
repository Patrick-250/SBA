package sba.sms.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Student{
	@NonNull
	private String email;
	private final String name;
	private final String password;
	private List<Course> courses = new ArrayList<Course>();
	

	public Student() {
		this.email = "";
		this.name = "";
		this.password = "";
		
	}


	
    /**
	 * @param email
	 * @param name
	 * @param password
	 * @param courses
	 */
	public Student(String email, String name, String password, List<Course> courses) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.courses = courses;
	}




    /**
	 * @param name
	 * @param password
	 */
	public Student(@NonNull String email, final String name, final String password) {
    	this.email = email;
		this.name = name;
		this.password = password;
    }


	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}
	
	


	/**
	 * @return the courses
	 */
	public List<Course> getCourses() {
		return courses;
	}



	/**
	 * @param courses the courses to set
	 */
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	/**
	 * @param add course
	 */
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	/**
	 * @param has course by id
	 */
	public boolean hasCourseById(int courseId) {
		for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId() == courseId) {
            	return true;
            }
		}
		
		return false;
	}
	


	@Override
	public String toString() {
		return "Student [email=" + email + ", name=" + name + ", password=" + password + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(courses, email, name, password);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(courses, other.courses) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}


	

}
