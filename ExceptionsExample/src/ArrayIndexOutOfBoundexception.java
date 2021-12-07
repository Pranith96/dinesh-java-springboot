
public class ArrayIndexOutOfBoundexception {
	public static void main(String[] args) {
		try {
			int a[] = new int[3];
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
			a[3] = 4;
			System.out.println(a);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Hi");
	}

}
