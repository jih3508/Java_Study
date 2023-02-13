package CH03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EX02 {

	public static void main(String[] args) throws IOException {
		//1
		List<Integer> list = new ArrayList<>();
		
		//2
		list.add(5);
		list.add(7);
		list.add(10);
		list.add(9);
		list.add(4);
		
		//3
		list.remove(list.indexOf(7));
		
		//4
		System.out.println(list.get(1) + "\n");
		
		//5
		Collections.sort(list, Collections.reverseOrder());
		
		//6
		list.forEach(i -> System.out.println(i));
		
		//7
		System.out.println("\n" + list.contains(11));	
	}
	
}
