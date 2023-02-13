package CH03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EX01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str; // 입력 받을 변수
		int n; // 구구단 변후
		
        // 1 ~ 9 까지 리스트에 저장
		List<String> check_number = new ArrayList<String>();
		for(int i = 1; i <=9; i++) {
			check_number.add(String.valueOf(i));
		}
        
		while(true) {
			System.out.println("[구구단] 몇 단을 출력하실건가요?\n");
			str = br.readLine();
			// exit입력시 루프 탈출
            if(str.equals("exit")) {
				break;
              // 1 ~ 9 포함 되어 있는지 여부 포함 안되어 있으면 다시 루프 시작
			}else if(!check_number.contains(str)) {
				System.out.println("1단에서 9단까지만 출력이 가능합니다.");
				continue;
			}
			
			n = Integer.parseInt(str);
            // 구구단 출력
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n" , n, i, n * i);
			}
			
			
		}
		System.out.println("프로그램을 성공적으로 종료했습니다.");
	}
}
