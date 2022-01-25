package Chapter2.task7;

public class task7_2 {
	private var value;
	public Sample (var value) {
		this.value = value;
	}
	public void test () {
		System.out.println(value);
	}

	/*解説
	 * varによる型推論は、ローカル変数の宣言にしか使用出来ない。
	 */
}
