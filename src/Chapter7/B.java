package Chapter7;

public interface B {
	default void test() {
		System.out.println("B");
	}
}
