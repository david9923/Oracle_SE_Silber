package Chapter7.task9;

abstract class AbstractSample {
	public void sample() {
		System.out.println("A");
		test();
		System.out.println("C");
		System.out.println("----");
		test2();
	}

	// 抽象メソッド
	// サブクラスで実現されるメソッド
	protected abstract void test();
	public abstract void test2();
}