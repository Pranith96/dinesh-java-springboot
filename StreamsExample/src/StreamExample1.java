import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> data = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(data);
		list.stream().filter(x -> x % 2 == 0).forEach(y -> System.out.println(y));

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> data1 = list1.stream().map(x -> x + 5).collect(Collectors.toList());
		System.out.println(data1);

		List<Integer> list2 = Arrays.asList(1, 2, 3, 11, 21, 1, 22, 15, 4, 5, 6, 7, 18, 8, 9, 10);
		list2.stream().sorted().forEach(x -> System.out.println(x));

		List<Student> students = Arrays.asList(new Student(1, "ANC"), new Student(2, "YUD"), new Student(5, "LPD"),
				new Student(4, "TYY"), new Student(3, "dis"));
		students.stream().sorted(Comparator.comparing(Student::getId)).forEach(x -> System.out.println(x));
		System.out.println("............................................................................");
		students.stream().sorted(Comparator.comparing(Student::getName)).forEach(x -> System.out.println(x));
		System.out.println("............................................................................");
		students.stream().filter(x -> x.getId() > 2).forEach(y -> System.out.println(y));

		List<List<Integer>> list4 = new ArrayList<>();
		list4.add(list2);
		list4.add(list1);
		list4.add(list);
		System.out.println(list4);

		List<Integer> list5 = list4.stream().flatMap(x -> x.stream().filter(y -> y % 2 == 0).sorted()).collect(Collectors.toList());
		System.out.println(list5);
		
		List<Integer> list6 = list4.stream().flatMap(x -> x.stream().filter(y -> y % 2 == 0).sorted()).sorted().collect(Collectors.toList());
		System.out.println(list6);
		
		long count  = list4.stream().flatMap(x -> x.stream().filter(y -> y % 2 == 0).sorted()).sorted().count();
		System.out.println(count);
	}

}
