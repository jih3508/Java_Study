package CH06.ex01;

public class Money {

  private int value;

  public Money(int value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object obj) {
    Money money2 = (Money) obj;
    return value == money2.value;
  }


}
