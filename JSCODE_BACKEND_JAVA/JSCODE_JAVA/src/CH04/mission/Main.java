package CH04.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Library library = new Library();
		library.add(new Book("클린코드(Clean Code)"));
		library.add(new Book("객체지향의 사실과 오해"));
		library.add(new Book("테스트 주도 개발(TDD)"));
		int n;
		
		while(true) {
			library.printLibrary();
			n = Integer.parseInt(br.readLine());
			library.rent(n);
			
		}
	}

}
