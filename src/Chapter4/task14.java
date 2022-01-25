package Chapter4;

public class task14 {

	public static void main(String[] args) {

		// 14.次のプログラムをコンパイル、実行したときの結果として、正しいものを選べ。
		String[] array = { "A", "B" };
		for (String a : array) {
			for (String b : array) {
				if ("B".equals(b)) {
					break;
				}
				System.out.println(b);
			}
		}

		/**
		 * 解説
		 *
		 * 二重ループの中で使われるbreakによって中断されるのは、直近にあるループだけ。
		 * 複数のループを一度に中断するにはラベルを使用する
		 */

	}

}
