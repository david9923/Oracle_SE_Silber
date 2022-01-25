package Chapter4;

public class task12 {

	public static void main(String[] args) {
		// 12.次のプログラムをコンパイル、実行したときの処理として正しいものを選べ。
		String[] array = { "A", "B", "C" };
		for (String str : array)
			str = "D";
		for (String str : array)
			System.out.println(str);
	}

	/**
	 * 解説
	 * 拡張for文では、繰り返し処理を実行するために一時的に変数を使っている。
	 * 変数の参照を変更しても、集合には影響しない。変数の参照先のオブジェクトを変更した場合は影響する
	 */

}
