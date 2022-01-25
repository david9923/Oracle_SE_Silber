package Chapter7.task15;

public class Main {
	public static void main(String[] args) {
		// 配列に格納しインスタンス化を行っている。
		A[] array = {
			new B(), // Aインターフェースを持っているA型のarray[0]インスタンス
			new C(), // Bクラスを継承したA型のarray[1]インスタンス
			// new A(), // Aはインターフェースのためインスタンス不可となっている
			// new D(), // クラスDはAクラスと継承関係にないためインスタンス不可となっている
		};
		B[] test = {
			new B(),
			new C()
		};
		test[0].before();

		C[] test2 = {
			// new B(),
			new C()
		};
		test2[0].after(); // afterメソッドはCクラスに定義された独自メソッド
	}
}