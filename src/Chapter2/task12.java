package Chapter2;

public class task12 {

	public static void main(String[] args) {

		// 次のプログラムをコンパイル、実行したときの結果として、正しいものを選べ（1つ選択）
		String str = "abcde";
		System.out.println(str.indexOf("abcdef"));

		/**
		 * 解説
		 * IndeOfメソッドは引数で指定された文字が文字列のどの位置に存在するかを調べるためのメソッド
		 *
		 * 調査対象の文字列は5文字しかないのに対し引数に指定した文字列は6文字ある。5文字の文字列の中に、
		 * 6文字の文字列は存在しないため、結果は「-1」が戻される。
		 */
	}
}
