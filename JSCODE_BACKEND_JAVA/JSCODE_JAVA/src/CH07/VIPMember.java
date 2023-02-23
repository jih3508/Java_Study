package CH07;

public class VIPMember extends Member {

  private int pt_number;

  public VIPMember(String email, String name, int age, int pt_number) {
    super(email, name, age);
    this.pt_number = pt_number;
  }

  public int getPT_number() {
    return pt_number;
  }

  public void setPT_number(int pt_number) {
    this.pt_number = pt_number;
  }

  @Override
  public String toString() {
    return "%s님은 VIP 회원이고 이메일은 %s이고, 나이는 %d살입니다.".formatted(this.getName(), this.getEmail(),
        this.getAge());
  }



}
