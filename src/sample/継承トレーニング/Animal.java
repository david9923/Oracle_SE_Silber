package sample.継承トレーニング;

public class Animal {
	public String myname; // 名前
	public int age; // 年齢
	public void eat(String something) {
		// 食べる
		System.out.println(something + "を食べました");
	}
	public void walk(int a) {
		// 歩く
		System.out.println(a.toString() + "メートル歩きました");
	}
}
