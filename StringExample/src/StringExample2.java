
public class StringExample2 {

	public static void main(String[] args) {

		String s = "Hello";

		int length = s.length();
		char c = s.charAt(1);
		boolean isfalse = s.contains(s);
		char[] ch = s.toCharArray();

		boolean isTrue = s.equalsIgnoreCase("HELLO");
		boolean result = s.isEmpty();

		System.out.println(length);
		System.out.println(c);
		System.out.println(isfalse);
		System.out.println(ch);
		System.out.println(isTrue);
		System.out.println(result);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(String.valueOf(5));
		System.out.println(s.substring(2));
		System.out.println(s.substring(0, 2));

		// string reverse
		// String pallindrone
		// How many chararacter are repeated in string 
		//aaabbccadde  = a3b2c2a1d2e1 ==> a4b2c2d2e1
	}
}
