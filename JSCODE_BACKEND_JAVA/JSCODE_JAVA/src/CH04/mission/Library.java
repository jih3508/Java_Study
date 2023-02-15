package CH04.mission;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> books;

	Library() {
		books = new ArrayList<>();
	}

	public void add(Book book) {
		books.add(book);
	}

	// rent(int index)라고 메서드명을 지어주셨는데, 실제로 파라미터로 받는 값은 index(인덱스)의 의미를 가지지 않습니다.
	// 따라서 index라는 파라미터명은 혼란을 야기할 수도 있습니다!
	// 아래와 같이 수정해보는 건 어떨까요?
	public boolean rent(int number) {
		int index = number - 1;
		if(books.get(number).isRent) {
			books.get(number).isRent = false;
			System.out.println("정상적으로 대여가 완료되었습니다.");
			return true;
		}
		System.out.println("대여 중인 책은 대여할 수 없습니다.");
		return false;
	}

	public void printLibrary() {
		System.out.println("대여할 책의 번호를 입력하세요.");
		for(int i = 0; i < books.size(); i++) {
			System.out.println(i + 1 + ". " + books.get(i).printBook());
		}
	}

}
