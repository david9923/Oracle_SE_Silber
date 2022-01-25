/** interfaceとdefaultの使い方 */

// 基本的な使い方

package sample;

interface InterfaceJpn {
	// defalut句を使用することで、interface内にメソッドを実装
	default String greething() {
		return "Hello Japan!";
	}
}

class ClassJpn implements InterfaceJpn {
	// オーバーライドしない
}

// public class InterfaceJpn {
// 	
// }

public class Main_1 {
	public static void main(String[] args) {
		ClassJpn cj = new ClassJpn();
		System.out.println(cj.greething());
	}
}
