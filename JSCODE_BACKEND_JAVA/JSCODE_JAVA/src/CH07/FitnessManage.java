package CH07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FitnessManage {

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  MemberRepository memberRepository = new MemberRepository();

  public void run() throws NumberFormatException, IOException {

    while (true) {

      // 회원 등록
      int menu = InputMenu();
      if (menu == 1) {
        try {
          memberRepository.createMember(residentMember());
          System.out.println("회원 등록이 성공적으로 완료되었습니다. ");
        } catch (IllegalArgumentException e) {
          System.out.println(e.getMessage());
          continue;
        }
      } else if (menu == 2) {
        SearchMember();
      }
    }
  }

  // 메뉴 입력
  private int InputMenu() throws NumberFormatException, IOException {
    System.out.println("원하시는 번호를 입력해주세요.");
    System.out.println("1. 회원 등록");
    System.out.println("2. 회원 조회");

    return Integer.parseInt(br.readLine());
  }

  // 회원 등록
  private Member residentMember() throws IOException {
    Member member;
    System.out.println("원하시는 번호를 입력해주세요.");
    System.out.println("1. 일반 회원");
    System.out.println("2. VIP 회원");
    int rating = Integer.parseInt(br.readLine());

    System.out.println("이메일을 입력해주세요.");
    String email = br.readLine();
    System.out.println("이름을 입력해주세요.");
    String name = br.readLine();
    System.out.println("나이를 입력해주세요.");
    int age = Integer.parseInt(br.readLine());



    if (rating == 2) {
      System.out.println("신청한 PT 횟수를 입력해주세요.");
      int pt_number = Integer.parseInt(br.readLine());
      member = new VIPMember(email, name, age, pt_number);
    } else {
      member = new NomalMember(email, name, age);
    }

    return member;
  }

  // 회원 조회
  private void SearchMember() throws IOException {
    System.out.println("조회하려는 회원의 이름을 입력해주세요.");
    memberRepository.readMember(br.readLine());
  }
}
