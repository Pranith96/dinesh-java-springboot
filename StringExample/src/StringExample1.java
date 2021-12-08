
public class StringExample1 {

	public static void main(String[] args) {

		String s = "Hello";
		String s1 = "Hello";
		s1 = s1.concat("World");
		System.out.println(s);
		System.out.println(s1);
		String s2 = "Hello";
		String s3 = new String("Hello");

		if (s == s2) {
			System.out.println("True" + s.hashCode() + " " + s2.hashCode());
		} else {
			System.out.println("False" + s.hashCode() + " " + s2.hashCode());
		}

		if (s == s3) {
			System.out.println("True" + s.hashCode() + " " + s3.hashCode());
		} else {
			System.out.println("False" + s.hashCode() + " " + s3.hashCode());
		}
		
		if (s.equals(s3)) {
			System.out.println("True" + s.hashCode() + " " + s3.hashCode());
		} else {
			System.out.println("False" + s.hashCode() + " " + s3.hashCode());
		}
	}
}
