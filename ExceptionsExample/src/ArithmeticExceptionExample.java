
public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		try {
		int i = 10;
		int j = i/0;
		System.out.println(j);
		} catch(ArithmeticException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Hello");
		}
		System.out.println("Hi");
	}

}
