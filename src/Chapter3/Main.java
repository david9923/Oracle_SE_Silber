package Chapter3;

public class Main {

	public static void main(String[] args) {
		// Sample s1 = new Sample(10);
		// Sample s2 = s1;
		Sample s1 = new Sample("aaa");
		// System.out.println(s1 == s2);
		// test s3 = new test(10);
		Sample s3 = s1;
		System.out.println(s1 == s3);

		String num1 = "hoge";
		String num2 = num1;
		// String num2 = "hoge";
		System.out.println(num1.equals(num2));

		/**
		 * 解説
		 * 「同じ」という言葉が、2つの意味を持っている。
		 * 1つ目は、同じインスタンスであること = 同一
		 *   ・複数の変数が同じインスタンスを参照していること指す
		 *
		 *   例：
		 *   public Sample1 (String test) {
		 *      this.test = test;
		 *   }
		 *
		 *   public static void main (String[] args) {
		 *       Sample hoge1 = new Sample("aaa");
		 *       Sample hoge2 = new Sample("aaa");
		 *       String hoge3 = hoge2;
		 *       System.out.println(hoge1 == hoge2);  // false
		 *       System.out.println(hoge2 == hoge3);  // true
		 *   }
		 *   falseではhoge1とhoge2のインスタンスに違いがあるため
		 *   trueではhoge3に対しhoge2を格納しているため。hoge3はhoge2と実質同じ意味となっている
		 *
		 *
		 * 2つ目は、同じ値であること = 同値
		 *   ・同地性とは、インスタンスは異なるけれど、同じ値を持っている性質のこと
		 *
		 *   例：
		 *   public Sample1 (String test) {
		 *      this.test = test;
		 *   }
		 *
		 *   public static void main (String[] args) {
		 *       Sample hoge1 = new Sample("aaa");
		 *       Sample hoge2 = new Sample("aaa");
		 *       String hoge3 = hoge2;
		 *       System.out.println(hoge1.equals(hoge2));  // true
		 *       System.out.println(hoge2.equals(hoge3));  // false
		 *   }
		 *   falseではhoge1とhoge2のインスタンスに違いがあるため
		 *   trueではhoge3に対しhoge2を格納しているため。hoge3はhoge2と実質同じ意味となっている
		 *
		 */
	}

}
