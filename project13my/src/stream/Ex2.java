package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Tomas");
		list.add("Edward");
		list.add("Jack");

		Stream<String> stream1 = list.stream();

		stream1.filter(s -> s.length() >= 5).sorted().forEach(s -> System.out.println(s));

		System.out.println();
		list.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
	}

}
