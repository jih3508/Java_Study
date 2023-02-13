package CH04.mission;

public class Book {

	String subject;
	boolean isRent;
	
	Book(String text){
		this.subject = text;
		this.isRent = true;
	}
	
	public String printBook() {
		return this.subject + " - " + (this.isRent? "대여 가능" : "대여 중");
	}
}
