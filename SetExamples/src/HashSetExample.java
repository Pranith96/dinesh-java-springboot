import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(2);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(4);
		set.add(6);
		set.add(2);
		set.add(7);
		set.add(4);

		System.out.println(set);

		Set<Integer> linkedHashset = new LinkedHashSet<>();
		linkedHashset.add(10);
		linkedHashset.add(2);
		linkedHashset.add(1);
		linkedHashset.add(4);
		linkedHashset.add(2);
		linkedHashset.add(9);
		linkedHashset.add(5);
		linkedHashset.add(3);
		linkedHashset.add(4);
		linkedHashset.add(11);
		linkedHashset.add(2);
		linkedHashset.add(7);
		linkedHashset.add(6);
		System.out.println(linkedHashset);

		Student student = new Student(1, "ABC");
		Student student1 = new Student(1, "XYZ");

		Set<Student> setStudent = new HashSet<>();
		setStudent.add(student);
		setStudent.add(student1);
		
		System.out.println(setStudent);
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "ABC");
		map.put(2, "XYZ");
		map.put(3, "ABC");
		map.put(4, "XYZ");
		map.put(5, "ABC");
		map.put(6, "XYZ");
		
		System.out.println(map);
		System.out.println(map.get(4));
		
		for(Map.Entry<Integer, String> data: map.entrySet()) {
			System.out.println("keys: " + data.getKey());
			System.out.println("Values : " + data.getValue());
		}
	}
}