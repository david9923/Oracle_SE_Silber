package Chapter7;

// public interface A {
// 	default void test() {
// 		System.out.println("A");
// 	}
// }
// 
// public interface B {
// 	default void test() {
// 		System.out.println("B");
// 	}
// }

public class task7 implements A, B {
	public static void main(String[] args) {
		new task7().test();
	}

	// interfaceA及びBに同一名のメソッドが定義されているため呼び出すメソッドを特定する必要がある。
	// @Override
	// public void test() {
	// 	A.super.test();
	// }
}
