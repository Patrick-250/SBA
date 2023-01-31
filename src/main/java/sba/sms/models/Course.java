package sba.sms.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Course {
	@NonNull
	private int id;
	private final String name;
	private final String instructor;
	private List<Student> students = new ArrayList<Student>();
	

	public Course() {
		this.name = "";
		this.instructor = "";
		this.students = new ArrayList<Student>();
	}


	/**
	 * @param id
	 * @param name
	 * @param instructor
	 * @param students
	 */
	public Course(int id, String name, String instructor, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.students = students;
	}


	/**
	 * @param id
	 * @param name
	 * @param instructor
	 * @param students
	 */
	public Course(@NonNull String name, String instructor) {
		super();
		this.name = name;
		this.instructor = instructor;
		this.students = new ArrayList<Student>();
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}


	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the instructor
	 */
	public String getInstructor() {
		return instructor;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", instructor=" + instructor + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, instructor, name, students);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return id == other.id && Objects.equals(instructor, other.instructor) && Objects.equals(name, other.name)
				&& Objects.equals(students, other.students);
	} 
	
	
	
}
