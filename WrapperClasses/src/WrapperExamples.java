
public class WrapperExamples {

	public static void main(String[] args) {
		int a = 10;
		Integer i = Integer.valueOf(a); // before java 5
		Integer j = a; // after java 5 ==> autoboxing
		System.out.println(i + " " + j);

		Integer b = new Integer(10);
		int k = b.intValue(); // before java 5
		int l = b; // unboxing
		System.out.println(k);
		System.out.println(b);
		System.out.println(l);

		String s = String.valueOf(a);
		Integer m = Integer.parseInt(s);
		Long o = Long.parseLong(s);

		Temp temp = new Temp();
		temp.hellloo();
		Temp.hello();
		System.out.println(Temp.TEMP_VARIABLE);

	}
}
