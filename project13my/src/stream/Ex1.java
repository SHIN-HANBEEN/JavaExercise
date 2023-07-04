package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {
		int[] intArr = {1, 5, 3, 2, 4};
		
		IntStream stream1 = Arrays.stream(intArr);
		stream1.limit(3).sorted().forEach(n->System.out.println(n));
		// intArr 배열을 정렬하고 3개를 뽑아서 출력하는 기능까지
		
		String[] strArr = {"abcde", "abc", "cdefgh"};
		
		Stream<String> stream2 = Arrays.stream(strArr);
		long count = stream2.filter(s->s.length() >= 5).count();
		System.out.println("배열에서 크기가 5이상인 문자열은 " + count + "개 입니다");
		// stream1 은 최종 연산까지 진행한 상태이므로 다시 사용할 수 없고, 
		// 새로운 stream 클래스를 생성해서 사용해야 한다. 
	}
}

