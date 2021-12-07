
public class Hello {

	public static void main(String[] args) throws IdNotFoundException2 {
		try {
			String s = "HI";
			if (s.length() == 2) {
				throw new IdNotFoundException2("lenth is equal to 2");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");

	}
}