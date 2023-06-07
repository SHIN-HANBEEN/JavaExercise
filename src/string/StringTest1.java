package string;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // false, 메모리 주소가 다름
		System.out.println(str1.equals(str2)); // true, String 의 equals
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); // true, 같은 상수 풀에서 가져옴
		System.out.println(str3.equals(str4)); // true, String 의 equals
	}

}
