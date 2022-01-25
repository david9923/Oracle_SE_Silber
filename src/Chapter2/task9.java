package Chapter2;

public class task9 {

	public static void main(String[] args) {
		String a = new String("sample");
		String b = "sample";
		// String c = String.newInstance("sample"); ×
		// String d = String.valueOf('sample');          ×
	}

	/*
	 * 解説
	 * Stringクラスは、ほかのクラスと同様にインスタンスを生成して利用する。
	 * Stringクラスのインスタンスを生成するにはいくつかの方法があるが、代表的なのは次の2通り。
	 *
	 * ・newを使ってインスタンス化する
	 * ・ダブルクォーテーション「*」で括った文字列リテラルを記述する
	 */

}
