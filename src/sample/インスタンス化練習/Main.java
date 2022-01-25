package sample.インスタンス化練習;

public class Main {
	// mainメソッド
	public static void main(String[] args) {
		// HelloJavaクラスのインスタンスを生成して、
		HelloWorld printHelloWorld = new HelloWorld();

		// 生成したインスタンスより、HelloWorldクラスのprintメソッドを呼び出す
		// printHelloWorld.print();

		// Unko a = new HelloWorld();
		HelloWorld a = new Unko();
		Unko b = (Unko) a;
		b.unkoPrint();
	}
}