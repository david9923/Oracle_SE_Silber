package Chapter8.task4_2;

public class Test {
	public static void main(String[] args) {
		String val = "hello";
		Function f = () -> {
			// val変数は実質的にfinal宣言されているため値の変更は不可能となっている
			// val = "test";
			System.out.println(val);
		};
		// ラムダ式外で変数の値を変更しようとしているが、ラムダ式が宣言されたタイミングで実行されるわけではないためコンパイルエラーとなる
		val = "test";
		f.test();
	}
}
