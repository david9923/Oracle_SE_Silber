package Chapter4;

public class task16 {

	public static void main(String[] args) {

		// 16.次の中から、ラベルが記述できるものを選べ。
		// A.if文やswitch文
		// B.式
		// C.代入
		// D.return文
		// E.tryブロック
		// F.選択肢A~Eすべて


		// 二重ループでbreakを使用したコード
		sample : // 外側のループの外にラベルを入れる
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (3 < j) {
						break sample; // ラベルsampleのループを抜ける
					}
				}
			}
	}

	/**
	 * 解説
	 * ラベルの仕様に関する問題
	 * ラベルを使うことで、breakやcontinueのときに制御を移す箇所を自由に指定できる。
	 *
	 */

}
