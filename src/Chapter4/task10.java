package Chapter4;

public class task10 {

	public static void main(String[] args) {
		// 10.次のプログラムの3行目の空欄に記述すると無限ループになるコードはどれか
		// for (int i = 0; true; i++) {
		// for (int i = 0; false; i++) {
		// for (int i = 0; ; i++) {
		for (int i = 0; i < 5;) {
			System.out.println(i);
		}
		/**
		 * 解説
		 * for文の条件式と更新式は省略可能
		 *
		 * for文の条件式を省略した場合は、break文を使用しない限り、無限ループとなる
		 */
	}
}