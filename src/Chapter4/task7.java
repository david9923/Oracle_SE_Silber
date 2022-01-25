package Chapter4;

public class task7 {

	public static void main(String[] args) {

		// 問題文のソースコード
		for (int i = 0, j = 0; i < 3, j < 5; i++) {
		// for (int i = 0, j = 0; i < 3 && j < 5; i++) {
			System.out.println(i++);
			j += i;
		}
	}

	/**
	 * 解説
	 * for文は、初期化文、条件文、更新文の3つと繰り返し処理で構成されている
	 * 3つの文のうち、複数記述できるのは初期化文と更新文の2つ
	 *
	 * 条件文は初期化文や更新文のようにカンマ「,」で区切って複数記述することはできない
	 * 複数の条件を記述したい場合には、論理演算子を使って複合条件の文にしなければいけない。
	 */
}
