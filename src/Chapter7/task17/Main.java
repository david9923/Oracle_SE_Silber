package Chapter7.task17;

public class Main {
	public static void main(String[] args) {
		// A a = new A();
		A a = new B();
		B b = (B) a;
		b.hello();
	}
	
}
