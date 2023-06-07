package object;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 관계연산자를 활용하여 메모리 주소 값이 같은지 비교
		System.out.println(str1.equals(str2));  // String 클래스에서 재정의된 equals 를 활용하여 문자열 값이 같은지 비교.
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 ==i2);  // 관계연산자를 활용하여 메모리 주소 값이 같은지 비교
		System.out.println(i1.equals(i2)); // Integer 클래스에서 재정의된 equals 를 활용하여 인스턴스 정수값이 같은지 비교.
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
	}

}
