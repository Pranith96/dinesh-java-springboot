import java.util.ArrayList;
import java.util.List;

public class MainMethod {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);
		int i = list.get(2);
		System.out.println(list.get(2));

		for (Integer data : list) {
			System.out.println(data);
		}
		
		
		list.remove(2);
		System.out.println(list);
		list.size();
	}

}
