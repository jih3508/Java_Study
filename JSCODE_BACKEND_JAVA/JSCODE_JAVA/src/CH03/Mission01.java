package CH03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Mission01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> students = new ArrayList<>();
		String str;
		while(true) {
			str = br.readLine();
			if(str.equals("print")){
				break;
			}else if(!str.isEmpty() && str.matches("^[가-힣]+$")) {
				students.add(str);
			}else {
				System.out.println("학생의 이름은 한글로만 입력해야 합니다.");
				continue;
			}
		}
		System.out.println("[학생 명단(가나다순)]");
		students.stream().sorted().forEach(System.out::println);
	}
}
