package sample;

interface InterfaceJpn {
	default String greeting() {
		return "Hello Japan!";
	}
}

interface InterfaceTky extends InterfaceJpn {
	default String greeting() {
		return "Hello Tolyo!";
	}
}

interface InterfaceOsk extends InterfaceJpn {
	default String greeting() {
		return "Hello Osaka!";
	}
}

class ClassPref implements InterfaceTky, InterfaceOsk {
	@Override
	public String greeting() {
		// super句を使って呼びたい方を選ぶ
		return InterfaceOsk.super.greeting();
	}
}

public class Main_2 {
	public static void main(String[] args) {
		ClassPref cp = new ClassPref();
		System.out.println(cp.greeting());
	}
}
