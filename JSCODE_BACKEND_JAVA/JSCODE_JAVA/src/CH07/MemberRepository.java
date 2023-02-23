package CH07;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

  private List<Member> members;

  public MemberRepository() {

    members = new ArrayList<Member>();
  }

  // 회원 저장
  public void createMember(Member member) {

    members.forEach((person) -> {
      if (person.getEmail().equals(member.getEmail())) {
        throw new IllegalArgumentException("이미 등록된 이메일이어서 회원 등록에 실패했습니다.");
      }
    });

    members.add(member);
  }

  public void readMember(String name) {
    members.forEach((member) -> {
      if (member.isEqualeWithName(name)) {
        System.out.println(member.toString());
      }

    });
  }

}
