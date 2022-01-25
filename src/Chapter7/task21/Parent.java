package Chapter7.task21;

public class Parent {
	public Parent() {
		// 4
		System.out.println("A");
		// →Aを表示
	}
	public Parent(String val) {
		// 3
		this();
		System.out.println(val);
		// →Bを表示
	}
}
