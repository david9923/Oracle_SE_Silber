package Chapter9.task9;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(0, "D");
		for (String str : list) {
			System.out.println(str);
		}
	}
}

// 0|A|1|B|2|C|3|D|4
