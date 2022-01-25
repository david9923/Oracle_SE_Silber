package Chapter2;

public class chapter2_1 {

	public static void main(String[] args) {

		// 次のプログラムをコンパイル、実行したときの結果として、正しいものをひとつ選びなさい。
		int val = 7;
		bool flg = true;
		if (flg == true) {
			do {
				System.outprintln(val);
			} while (val > 10);
		}

		/* JavaではC言語やC++の影響を強く受けたプログラミング言語だが、C言語で真偽値を表すbool値はJavaには存在しない */
		/* ※補足
		 * Javaで使用するプリミティブ型のデータ型
		 * ・boolean : true, false
		 * ・char : 16ビットUnicode文字 \u0000~\uFFFF
		 * ・byte : 8ビット整数 -128～127
		 * ・short : 16ビット整数 -32768～32767
		 * ・int : 32ビット整数 -2147483648～2147483647
		 * ・long : 64ビット整数 -9223372036854775808～9223372036854775807
		 * ・float : 32ビット単精度浮動小数点
		 * ・double : 64ビット倍制度浮動小数点数
		 */
	}
}
