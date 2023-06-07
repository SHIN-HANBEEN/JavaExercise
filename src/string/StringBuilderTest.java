package string;

public class StringBuilderTest {
//** 질문 왜 String 을 객체로 만들었을 때랑 상수 풀을 대입했을 떄랑 메모리 주소가 같지?
	public static void main(String[] args) {
		String javaStr = "Java";
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr)); // 인스턴스가 처음 생성되었을 때 메모리 주소

		StringBuilder buffer = new StringBuilder(javaStr); // String 으로부터 StringBuilder 생성
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));

		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!"); // buffer StringBuilder 에게 문자열 추가
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));

		javaStr = buffer.toString(); // buffer 를 다시 String 클래스로 반환
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
	}

}
