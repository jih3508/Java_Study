package CH03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Mission02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<float[]> players = new ArrayList<>();
		String str;
		int player; // 선수 번호
		float record; // 기록
		boolean flag;
		int index = -1; // 리스트 위치 값
		while(true) {
			System.out.println("선수의 번호를 입력하세요.");
			str = br.readLine();
			if(str.equals("print")) {
				break;
			}
			player = Integer.parseInt(str);
			System.out.println("이 선수의 100m 달리기 기록이 몇 초인지 입력하세요.");
			record = (float) ((float)(Math.round(Float.parseFloat(br.readLine()) * 100)) / 100.0);
			flag = true;
			for(int i = 0; i < players.size(); i++) {
				if(players.get(i)[0] ==  player) {
					index = i;
					flag = false;
					break;
				}
			}
			if(flag) {
				players.add(new float[] {player, record});
			}else {
				players.get(index)[1] = record;
			}
		}
		
		int best_palyer = 0;
		float best_recode = Float.MAX_VALUE;
		for(float[] result : players) {
			if(result[1] < best_recode) {
				best_palyer = (int) result[0];
				best_recode = result[1];
			}
		}
		
		System.out.printf("1등 : %d번 선수 / %.2f초 (참가인원 : %d명)", best_palyer, best_recode, players.size());
		
	}
}
