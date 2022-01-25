package Chapter4;

public class task4 {

	public static void main(String[] args) {
		// 設問のソースコード
		for (int i = 1; long j = 2; i < 5; i++) {
		// for (int i = 1,  j = 2; i < 5; i++) {
			System.out.print(i * j);
		}

		/**
		 * 解説
		 * 初期化文は、同時に複数の変数を宣言、初期化できる。
		 * 複数の変数を宣言、初期化するにはカンマ「,」で区切って列挙する
		 *
		 * for (int i = 0, j = 0; i < 3; i++) {
		 *		// 繰り返し処理
		 * }
		 *
		 * 初期化分で複数の変数を宣言する場合、変数は同じ型でなければならない
		 * 異なる型の複数の変数を宣言すると、コンパイルエラーが発生する
		 * 設問のソースコードでは、初期化文としてint型とlong型の異なる型の変数を同時に宣言する
		 */
	}

}
