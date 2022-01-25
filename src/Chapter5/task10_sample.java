package Chapter5;

public class task10_sample {
	public static void main(String[] args) {
		// int[] arrayA = {1, 2, 3, 4};
		// int[] arrayB = arrayA.clone();
		// System.out.println(arrayA == arrayB);
		// for (int i : arrayB) {
		// 	System.out.println(i);
		// }
		int[] array = new int[3];
		Class clazz = array.getClass();
		System.out.println(clazz.getCanonicalName());
	}
}
