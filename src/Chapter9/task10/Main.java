package Chapter9.task10;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		// addは値を追加するがsetは値を置き換える
		list.add("A");
		list.set(0, "B");
		list.add("C");
		list.set(1, "D");
	}
}
