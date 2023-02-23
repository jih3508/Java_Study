package CH07;

public class Member {

  private String email;
  private String name;
  private int age;

  Member(String email, String name, int age) {
    this.email = email;
    this.name = name;
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "%s님의 이메일은 %s이고, 나이는 %d살입니다.".formatted(this.name, this.email, this.age);
  }

  public boolean isEqualeWithName(String name) {
    return this.name.equals(name);
  }

}
