package Chapter7.task16;

public class Main {
	public static void main(String[] args) {
		A a = new B();
		a.test();

		/**
		 * BクラスはAクラスを継承している
		 * A型としてインスタンスを定義するとBクラスで定義されているフィールド変数やメソッドが使用出来ない
		 * ダウンキャストを用いてA型インスタンス→B型インスタンスへとダウンキャストすることにより、Bクラスのメソッドが使用可能となる
		 */

		// A型で定義したaインスタンスをB型へダウンキャスト
		B b = (B) a;
		b.hello();
		b.test();

		B c = new B();
		c.hello();
		c.test();
	}
	
}
