package Chapter5;

public class task10 {

	public static void main(String[] args) {
		int[][] arrayA = { { 1, 2 }, { 1, 2 }, { 1, 2 } };
		int[][] arrayB = arrayA.clone();
		int total = 0;

		// cloneメソッド arrayBインスタンスの中身確認テスト
		// for (int i = 0; i < 3; i++) {
		// 	for (int j = 0; j < 2; j++) {
		// 		total += arrayB[i][j];
		// 		System.out.println(arrayB[i][j]);
		// 	}
		// }
		for (int[] tmp : arrayB) {
			for (int val : tmp) {
				total += val;
			}
		}
		System.out.println(total);

		/**
		 * 解説
		 * cloneメソッドを使用した配列のコピーに関する問題
		 * 次のコードでは、cloneメソッドを使って、arrayAで参照する配列を次の行でコピーしている。
		 *
		 * cloneメソッドを使った配列のコピー
		 * int[] arrayA = { 1, 2, 3, 4 };
		 * int[] arrayB = arrayA.clone();
		 * System.out.println(arrayA == arrayB);
		 * for (int i : arrayB) {
		 * 		System.out.println(i);
		 * }
		 */
	}
}