package Chapter2;

public class chapter2_2 {

	public static void main(String[] args) {

	// 2.次の式のうち、コンパイルエラーになるものを選びなさい
		int a = 267;                // 10進数
		int b = 0413;              // 8進数
		int c = 0x10B;            // 16進数
		int d = 0b100001011; // 16進数
		// int e = 0872;             // 8進数の整数リテラルと判断出来るが8進数は0~7の数値を使用し表示するため、「8」という数値は使用不可

		/* ※補足※
		 *
		 * Javaでは、数値を10進数の他に、2進数、8進数、16進数のリテラルで表記でき、それぞれ、0b、0、0xで開始する
		 *
		 */
	}
}
