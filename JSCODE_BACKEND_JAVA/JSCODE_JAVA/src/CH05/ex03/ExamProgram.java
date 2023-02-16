package CH05.ex03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ExamProgram {

  static int HTML, CSS, Javascript, number;
  static int[] gradles;
  StringBuilder sb = new StringBuilder();

  public void execute() throws NumberFormatException, IOException {

    input();// 입력
    gradles = new int[] {HTML, CSS, Javascript};
    isAcceptance();
    print();

  }

  /*
   * 입력
   */
  public void input() throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("몇 기인지 입력해주세요.");
    number = Integer.parseInt(br.readLine());
    System.out.println("HTML 과목 점수를 입력해주세요.");
    HTML = Integer.parseInt(br.readLine());;
    System.out.println("CSS 과목 점수를 입력해주세요.");
    CSS = Integer.parseInt(br.readLine());
    System.out.println("Javascript 과목 점수를 입력해주세요. ");
    Javascript = Integer.parseInt(br.readLine());
  }

  // 평균
  public double avg() {
    return Arrays.stream(gradles).average().getAsDouble();
  }

  // 최대 값
  public int maxValue() {
    return Arrays.stream(gradles).max().getAsInt();
  }

  // 최소 값
  public int minValue() {
    return Arrays.stream(gradles).min().getAsInt();
  }

  // 합격 여부
  public void isAcceptance() {
    // 합격 불합격 기준
    double avg = avg();
    if ((number > 2 && avg >= 70) || (number <= 2 && avg >= 60)
        || (Arrays.stream(gradles).filter(jumsu -> jumsu == 100).count() >= 2)) {
      sb.append("합격입니다.\n");
    } else {
      sb.append("불합격입니다.\n");
    }
  }

  // 출력
  public void print() {
    sb.append("전체 과목 중 최고점은 ").append(maxValue()).append("점입니다.\n");
    sb.append("전체 과목 중 최저점은 ").append(minValue()).append("점입니다.\n");
    sb.append("전체 과목 중 평균은 ").append(avg()).append("점입니다.\n");

    System.out.println(sb);
  }


}
