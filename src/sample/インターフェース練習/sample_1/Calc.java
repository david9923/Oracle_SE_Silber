// 2つのインターフェースを実装するクラスの作成
package sample.インターフェース練習.sample_1;

class Calc implements Add, Sub {
	public void add() {
		System.out.println(NUM1 + NUM2);
	}

	public void sub() {
		System.out.println(NUM1 - NUM2);
	}
}