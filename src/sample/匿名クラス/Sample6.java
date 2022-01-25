package sample.匿名クラス;

public class Sample6 { // 実行クラス
	public static void main(String[] args) {
		String str = new Foo() { // 実行クラスを生成するが変数に代入せず、メソッドの実行結果を変数strに代入
			@Override
			public String methodA(String str) { // 抽象メソッドのオーバーライド
				return "Hello" + str;
			}
		}.methodA("methodA"); // 生成したインスタンスに対してメソッドの呼び出し methodAを引数として渡している
		System.out.println(str);
	}
}