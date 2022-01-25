
// Calcインターフェースの定義
package sample.インターフェース練習.sample_2;

public interface Calc {

	// 変数の定義
	// インターフェースのメンバ変数では暗黙的に定数(public static final)が付与される
	int num1 = 1;
	int num2 = 2;
	String str1 = "multiplecation";
	String str2 = "division";

	void calculation();
}
