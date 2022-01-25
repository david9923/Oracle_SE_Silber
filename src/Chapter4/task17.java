package Chapter4;

public class task17 {

	public static void main(String[] args) {
		int total = 0;
		a: for (int i = 0; i < 5; i++) {
			b: for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) {
					continue a;
				}
				if (3 < j) {
					break b;
				}
				total += j;
			}
		}
		System.out.println(total);

		/**
		 * 解説
		 * i = 0, j = 0, total = 0;  continueでラベルaへ
		 * i = 1, j = 0, total = 0;  totalに0を加算
		 * i = 1, j = 1, total = 1;  totalに1を加算
		 * i = 1, j = 2, total = 3;  totalに2を加算
		 * i = 1, j = 3, total = 6;  totalに3を加算
		 * i = 1, j = 4, total = 6;  breakでラベルbへ
		 * i = 2, j = 0, total = 6;  continueでラベルbへ
		 * i = 3, j = 0, total = 6;  totalに0を加算
		 * i = 3, j = 1, total = 7;  totalに1を加算
		 * i = 3, j = 2, total = 9;  totalに2を加算
		 * i = 3, j = 3, total = 12; totalに3を加算
		 * i = 3, j = 4, total = 12; breakでラベルbへ
		 * i = 4, j = 0, total = 12; continueでラベルaへ
		 */
	}
}
