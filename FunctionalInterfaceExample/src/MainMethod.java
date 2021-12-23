
public class MainMethod {
	public static void main(String[] args) {
		Addition additionImpl = new AdditionImpl();
		additionImpl.add();

		Addition addition = () -> System.out.println("Add");
		addition.add();
		Addition.hello();
		addition.hi();

		Summation summation = (x, y) -> {
			int c = x + y;
			System.out.println(c);
		};
		summation.sum(5, 6);
	}

}
