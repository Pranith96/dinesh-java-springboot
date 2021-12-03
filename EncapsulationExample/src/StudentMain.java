
public class StudentMain {

	public static void main(String[] args) {

		Address address = new Address();
		address.setAddressId(1);
		address.setCity("Hyd");
		address.setCountry("India");

		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Dinesh");
		student.setMobileNumber("123456789");
		student.setAddress(address);

		System.out.println(student);

		System.out.println(student.getStudentName());

		Student student1 = new Student(1, "Pranith", "123456789", new Address(1, "qwe", "124"));
		System.out.println(student1);

	}
}
