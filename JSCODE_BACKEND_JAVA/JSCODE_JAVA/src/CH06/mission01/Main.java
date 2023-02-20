package CH06.mission01;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean isContinued = true;
    while (isContinued) {
      System.out.println("숫자를 입력해주세요.");
      String input = scanner.nextLine();
      try {
        int number = Integer.parseInt(input);
        System.out.println("입력하신 숫자는 " + number + "입니다.");
      } catch (NumberFormatException e) {
        // 입력 잘못 할시 continue로
        System.out.println("잘못된 값을 입력하셨습니다.");
        continue;
      }
    }
  }
}
