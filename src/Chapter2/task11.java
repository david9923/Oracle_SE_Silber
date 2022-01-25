package Chapter2;

public class task11 {

	public static void main(String[] args) {
		// 11.次のプログラムをコンパイル、実行したときの結果として、正しいものをひとつ選びなさい(１つ選択)
		String str = "abcde";
		System.out.println(str.charAt(5));

		/**
		 * 解説
		 * cahraATメソッド
		 * インスタンスが保持している文字列から、引数で指定された位置にある1文字だけを抜き出して戻す。
		 *
		 * 例題では6番目の文字が存在しないため、実行すると範囲外にアクセスされたことを示す例外
		 * java.lang.StringIndexOutOfBoundsException
		 * がスローされる。
		 */
	}
}
