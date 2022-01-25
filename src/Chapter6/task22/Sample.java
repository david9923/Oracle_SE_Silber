package Chapter6.task22;

public class Sample {
	static int num;
	
	// A.初期化子
	{
		num = 10;
	}
	
	// B.コンストラクタ
	public Sample() {
		num = 100;
	}
	
	// 初期化子やコンストラクタで、インスタンス生清前にクラス変数の値を初期化することは出来ない。
	// 初期化子もコンストラクタも、インスタンスを生成するタイミングでしか実行されない。
	
	// static初期化子はインスタンスを生成しなくても使える変数
	static {
		num = 10;
	}

}
