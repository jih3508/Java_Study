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

		// int n;을 꼭 밖에 따로 선언해주어야 하는 이유가 없다면, 선언과 초기화를 한 번에 해주는 게 좋습니다.
		// 아래와 같이 코드를 수정해보는 건 어떨까요~?
		while(true) {
			library.printLibrary();
			int n = Integer.parseInt(br.readLine());
			library.rent(n);

		}
	}

}
