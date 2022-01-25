package Chapter7.task9;

public class Main {
	public static void main(String[] args) {
		AbstractSample s = new ConcreteSample();
		// ConcreteSample s = new ConcreteSample();
		// AbstractSample s = new AbstractSample();
		s.sample(); // AbstractSampleに定義されている具象メソッド
		System.out.println("----");
		s.test2();
	}
}

// 抽象クラスからのメソッド呼び出しに関する問

/**
 * 1,mainクラスのs.sample()で「A」を表示する
 * 2,AbstractSampleクラスのtest()を呼び出す
 */
