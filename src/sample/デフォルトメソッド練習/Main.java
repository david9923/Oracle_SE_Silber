package sample.デフォルトメソッド練習;

public class Main {
	public static void main(String[] args) {
		Employee emp = new SalesEmployee();
		emp.setId(1000);
		emp.setName("営業たろう");

		System.out.println("id:" + emp.getId());
		System.out.println("name:" + emp.getName());
	}
}
