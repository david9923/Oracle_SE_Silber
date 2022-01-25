package Chapter4;

public class task9 {

	public static void main(String[] args) {
		int array[][] = new int [][] {{1, 2}, {2, 3, 4}};
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			// for (int j = 0; j < array[i].length; j++) {
			// for (int j = 0; j < array[j].length; j++) {
			for (int j = i; j < array[i].length; j++) {
			// for (int j = i; j < array[j].length; j++) {
				total += array[i][j];
			}
		}
		System.out.println(total);
	}
}
