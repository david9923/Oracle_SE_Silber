package Chapter8.task4;

public class Sample {
	public static void main(String[] args) {
		int cnt = 0;
		// ラムダ式を使ってインスタンス化の簡略化を実施している
		Runnable r = () -> {
			String aaa = "aaa";

			for (cnt = 0; cnt < 10; cnt++) {
				System.out.println(cnt++);
			}
			System.out.println(cnt);
		};
	}
}
