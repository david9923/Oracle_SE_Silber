// ローカルクラスの実装
package sample.ラムダ式勉強.ローカルクラス;

public class Local2 {
	public static void main(String[] args) {
		class Localclasssample {
			public void sayHello() {
				System.out.println("Hello");
			}
		}

		Localclasssample local = new Localclasssample();
		Local2 l = new Local2();
		local.sayHello(); // Hello
		// local.LocalClassUnko lcu = local.new LocalClassUnko();

		// メンバークラスのインスタンス化とメソッドの呼び出し
		Local2.MemberClass member = l.new MemberClass();
		member.Sample();

		// ローカルクラスのインスタン化とメソッドの呼び出し
		// ・・・は不可能なのでメンバークラス定義に変更してメソッドの呼び出しを行ってみた件
		Local2.LocalClassUnko lcu = l.new LocalClassUnko();
		lcu.Sample();

		// ローカルクラスのメソッドの呼び出しは不可能
	}

	// public void test() {
		class LocalClassUnko {
			void Sample () {
				System.out.println("ローカルクラス内のメソッドを呼び出しました。");
			}
		}
	// }

	class MemberClass {
		void Sample() {
			System.out.println("メンバークラス内のメソッドを呼び出しました。");
		}
	}
}