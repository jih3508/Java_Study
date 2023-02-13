package CH04.ex03;

public class Calculator {
	
	String name;
	
	public Calculator(String name) {
		this.name = name;
	}

	// 이름 출력
	public String getOwner() {
		return this.name;
	}
	
	// 더라기
	public int add(int a, int b) {
		return a + b;
	}
	
	//빼기
	public int minus(int a, int b) {
		return a - b;
	}
	
	// 곱하기
	public int multiply(int a, int b) {
		return a * b;
	}
	
	// 나누기
	public int divide(int a, int b) {
		return a / b;
	}
	
	// 나누기
	public int divide(String a, String b) {
		return Integer.parseInt(a) / Integer.parseInt(b);
	}
}
