package Chapter4;

public class task11 {

	public static void main(String[] args) {
		String [][] array = { { "A", "B", "C" } };
		for (Object obj : array) {
		// for (String str : array) {
		// for (Strign[] array : array) {
		// for (array : Object obj) {
		// for (array : String str) {
		// for (array : String[] array) {
			System.out.println(obj);
		}

		/**
		 * 解説
		 *
		 * 拡張for文に関する設問
		 * for ( 型 変数名：集合 ) {
		 * 		// 繰り返し処理
		 * }
		 *
		 * ・拡張for文の構文は、「一時変数の宣言：コレクション／配列」 の順番を間違えないようにする
		 * ・鶴城for文の集合には、配列とjava.util.ArrayListが使えることを覚えておく
		 * ・拡張for文で2次元配列を扱う場合、1次元目の配列から要素（2次元目の配列への参照）を取り出して、一時変数に代入する
		 */

	}

}
