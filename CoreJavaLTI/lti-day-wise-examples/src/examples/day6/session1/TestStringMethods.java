package examples.day6.session1;

import java.util.ArrayList;

class Student {
	private int rollNo;
	private String name;
	private String grade;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, String grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + "]";
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
public class TestStringMethods {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Alex", "A"));
		students.add(new Student(2, "Brad", "B"));
		students.add(new Student(4, "Charles", "A+"));
		students.add(new Student(3, "David", "B+"));
		students.add(new Student(6, "Eddy", "C+"));
		students.add(new Student(4, "Franky", "C"));
		ArrayList<Student> topStudents = new ArrayList<Student>();
		for(Student student : students) {
			String grade = student.getGrade();
			if(grade.startsWith("A") || grade.startsWith("B+")) {
				topStudents.add(student);
			}
		}
		for(Student student : topStudents) {
			System.out.println(student);
		}
		System.out.println(topStudents.containsAll(students));
		students.addAll(topStudents);
		System.out.println(students);
		students.removeAll(topStudents);
		System.out.println(students);
	}
}
