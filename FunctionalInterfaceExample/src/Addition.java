
@FunctionalInterface
public interface Addition {
	public void add();

	public static void hello() {
		System.out.println("Hello");
	}

	default void hi() {
		System.out.println("Hi");
	}
}
