package CH06.mission02;

public class PhoneNumber {

  private String number01, number02, number03;

  public PhoneNumber(String phoneNumber) {
    if (phoneNumber.substring(0, 3).equals("010")) {
      number01 = phoneNumber.substring(0, 3);
    } else {
      throw new IllegalArgumentException("휴대폰 번호는 010으로 시작해야 합니다.");
    }

    if (phoneNumber.length() == 11) {
      number02 = phoneNumber.substring(3, 7);
      number03 = phoneNumber.substring(7, 11);
    } else {
      throw new IllegalArgumentException("휴대폰 번호는 11글자여야 합니다.");
    }
  }

  public String getPhoneNumberFormally() {
    return number01 + "-" + number02 + "-" + number03;
  }
}
