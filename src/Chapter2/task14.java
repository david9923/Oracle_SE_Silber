package Chapter2;

public class task14 {

	public static void main(String[] args) {

		// 14.次のプログラムをコンパイル、実行したときの結果として、正しいものを選べ（1つ選択）
		String str = "aaaa";
		System.out.println(str.replace("aaaa", "c"));
	}

	/**
	 * 解説
	 * java.lang.Stringクラスのreplaceメソッドは文字列を置き換えるためのメソッド
	 * 文字列の置き換えは先頭から始まり、文字列の最後まで行われる
	 */
}
