package Chapter2;

public class task10 {

	public static void main(String[] args) {
		// 10.次のプログラムをコンパイル、実行したときの結果として正しいものを選べ。(1つ選択)
		String str = "hoge, world.";
		hello(str);
		System.out.println(str);
	}

	private static void hello(String msg) {
		msg.replaceAll("hoge", "hello");
	}

	/* Stringオブジェクトが不変なオブジェクトであることを理解するための問題
	 * ・すべてのフィールドをprivateで修飾する
	 * ・オブジェクト内部の状態を変更可能なメソッドを提供しない。(たとえばsetteメソッドを提供しない)
	 * ・クラスをfinalで宣言し、メソッドがオーバーライドされないことを保証する(サブクラスからの変更を防ぐ)
	 * ・内部に可変オブジェクトを保持している場合、そのオブジェクトを外部に提供しない(たとえばgetterメソッドを提供しない)
	 */
}
