package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3);
		Stream<Integer> stream = list.stream(); // 리스트에서 스트림 생성
		int sum = stream.mapToInt(n -> n.intValue()).sum();

		list.stream().sorted().forEach(n -> System.out.println(n));
		System.out.println("스트림 정렬 후 리스트: " + list);

		list.stream().filter(n -> n >= 3).sorted().forEach(n -> System.out.println(n));
	}

}
