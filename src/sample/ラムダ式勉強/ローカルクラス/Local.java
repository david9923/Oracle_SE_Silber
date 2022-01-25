// ローカルクラスの実装
package sample.ラムダ式勉強.ローカルクラス;

public class Local {

	public static void main(String[] args) {
		class Localclasssample {
			public void sayHello() {
				System.out.println("Hello");
			}
		}

		Localclasssample local = new Localclasssample();
		local.sayHello(); // Hello
	}
}