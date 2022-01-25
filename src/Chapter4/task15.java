package Chapter4;

public class task15 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int total = 0;
		for (int i : array) {
			if (i % 2 == 0) {
				continue;
			}
			total += i;
		}
		System.out.println(total);
	}

	/**
	 * 解説
	 * continueは、移行の処理をスキップしてループの条件判定に戻る。
	 *
	 * 設問のコードでは、2で割って余りが0の値、つまり偶数の値であった場合にcontinueを実行して処理をスキップする。
	 * 一方、奇数の場合は、8行目でその値を合計する。
	 */

}
