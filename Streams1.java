
//converting the list of students to the stream,converting that stream to set using Collectors.toSet() method
package Streams;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class Streams1 {
	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student(1, "sri", 21));
		studentlist.add(new Student(2, "navee", 19));
		studentlist.add(new Student(3, "priya", 25));
		studentlist.add(new Student(4, "Sana", 23));
		studentlist.add(new Student(5, "Maha", 19));
		Set<Student> students = studentlist.stream().filter(n -> n.id > 2).collect(Collectors.toSet());
		for (Student stu : students) {
			System.out.println(stu.id + " " + stu.name + " " + stu.age);
		}
	}
}