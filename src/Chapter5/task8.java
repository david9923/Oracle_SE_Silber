package Chapter5;

public class task8 {

	public static void main(String[] args) {
		String[][] array = {{ "A", "B" }, null, { "C", "D", "E" } };
		// String[][] array = {{ "A", "B" }, { "F", "G", "H", "I" }, { "C", "D", "E" } };
		int total = 0;
		for (String[] tmp : array) {
			total += tmp.length;
		}
		System.out.println(total);
		/**
		 * 解説
		 * 1次元目の2つ目の要素はnullで初期化されており、どこも参照していない
		 * 設問のソースコードではarrayで参照できる1次元目の配列から要素を取り出し、lengthを使って
		 * 要素数を数えようとしているが、2つ目の要素の値はnullであり、参照先は存在しない。
		 * 以上のことからNullPointExceptionが発生する。
		 */
	}

}
