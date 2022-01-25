package sample.Stream_API;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample {
	public static void main(String[] args) {
		// 1=6までの値をリストに格納
		List<Integer> list = Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6});

		// listから偶数の要素のみを抽出
		Stream<Integer> result = list.stream().filter(n -> n % 2 == 0);

		// 結果をコンソールに出力
		result.forEach(n -> System.out.println(n));

		// List<Integer> result = new ArrayList<>();
		// for (int i = 0; i < list.size(); i++) {
		// 	if (list.get(i) % 2 == 0) {
		// 		result.add(list.get(i));
		// 	}
		// }

		// for (Integer integer : result) {
		// 	System.out.println(integer);
		// }
	}
}
