package CH04.ex02;

public class Person {

	String name;
	int age;
	boolean isUniverseStudent;
	double weight;
	
	// 생성자 오버로딩
	Person(String name, int age, boolean isUniverseStudent, double weight){
		this.name = name;
		this.age = age;
		this.isUniverseStudent = isUniverseStudent;
		this.weight = weight;
	}
	
	Person(String name, int age, boolean isUniverseStudent, String weight){
		this.name = name;
		this.age = age;
		this.isUniverseStudent = isUniverseStudent;
		this.weight = Double.parseDouble(weight);
	}
	
	Person(String name, String age, boolean isUniverseStudent, double weight){
		this.name = name;
		this.age = Integer.parseInt(age);;
		this.isUniverseStudent = isUniverseStudent;
		this.weight = weight;
	}
	
	Person(String name, String age, boolean isUniverseStudent, String weight){
		this.name = name;
		this.age = Integer.parseInt(age);
		this.isUniverseStudent = isUniverseStudent;
		this.weight = Double.parseDouble(weight);
	}
	
	public void printProfile() {
		System.out.printf("이름 : %s\n", this.name);
		System.out.printf("나이 : %d\n", this.age);
		System.out.printf("대학생인가요? : %b\n", this.isUniverseStudent);
		System.out.printf("몸무게 : %.1f\n", this.weight);
	}
}
