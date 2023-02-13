package CH04.ex04;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("제이슨", 87, 92));
		students.add(new Student("레이첼", 82, 92));
		students.add(new Student("리사", 92, 88));
		
		for(Student student : students) {
			student.printStudent();
		}

	}

}
