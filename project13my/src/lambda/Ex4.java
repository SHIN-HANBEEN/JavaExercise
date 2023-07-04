package lambda;

import java.util.*;

public class Ex4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa", "ccc", "bbb");
		
		// 익명클래스 넣기
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		System.out.println("리스트 역정렬 : " + list);
		
		// 람다식 함수 넣기
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2)); 
		System.out.println("리스트 순정렬 : " + list);
	}
}
