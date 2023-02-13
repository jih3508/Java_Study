package CH04.ex04;

public class Student {
	
	String name;
	int kor;
	int eng;
	
	Student(String name, int kr, int en){
		this.name = name;
		this.kor = kr;
		this.eng = en;
	}
	
	public void printStudent() {
		StringBuilder sb = new StringBuilder();
		sb.append("이름 : ").append(name).append("\n")
			.append("국어 : ").append(kor).append("\n")
			.append("영어 : ").append(eng).append("\n");
		System.out.println(sb);
	}

}
