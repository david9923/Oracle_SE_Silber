package sample.デフォルトメソッド練習;

public interface Employee {
	void setId(Integer id);

	default Integer getId() {
		return 0;
	}

	void setName(String name);

	default String getName() {
		return "No Name";
	}
}
