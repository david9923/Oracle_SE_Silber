package Chapter7.task21;

public class Child extends Parent {
	public Child() {
		// 2
		super("B");
		System.out.println("C");
		// →Cを表示
	}
	public Child(String val) {
		// 1
		this();
		System.out.println(val);
		// →Dを表示
	}
}
