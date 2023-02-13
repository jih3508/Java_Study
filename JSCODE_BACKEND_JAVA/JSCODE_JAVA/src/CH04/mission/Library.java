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
	
	public boolean rent(int index) {
		if(books.get(index - 1).isRent) {
			books.get(index - 1).isRent = false;
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
