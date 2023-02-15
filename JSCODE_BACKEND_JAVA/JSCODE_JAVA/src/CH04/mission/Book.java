package CH04.mission;

public class Book {
	// Book 클래스에서 필드(subject, isRent)에 대해서는 private을 선언해 캡슐화를 지켜주는 것이 좋습니다!
	// (아직 수업 내용에 배우지 않은 내용이긴 하지만, 금방 알아들으실 것 같아 피드백합니다~!)
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
