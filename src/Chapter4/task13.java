package Chapter4;

public class task13 {

	public static void main(String[] args) {


		int hoge = 1;
		System.out.println(++hoge);

		int hogu = 1;
		System.out.println(hogu++);
		System.out.println(hogu);
		System.out.println(hogu++);
		System.out.println(hogu);

		int num = 1;
		// System.out.println(num++);
		// System.out.println(++num);
		// 13.次のコードと同じ結果を出力するコードを選べ
		// int num = 10;
		// do {
		// 	num ++;
		// } while (++num < 10);
		// System.out.println(num);


		// 回答群
		// A. 11
		// int num = 10;
		// while (++num < 10)
		// 	num++;
		// System.out.println(num);

		// B. 11
		// int num = 10;
		// while (++num <= 10)
		// 	num++;
		// System.out.println(num);

		// C. 11
		// int num = 10;
		// while (num++ < 10)
		// 	num++;
		// System.out.println(num);

		// D. 13
		// int num = 10;
		// while (num++ <= 10)
		// 	num++;
		// System.out.println(num);

		// E.選択肢A~Dはすべて誤りである

	}
}
