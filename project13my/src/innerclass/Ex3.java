package innerclass;

class OutClass {
	int a = 10;
	static int b = 20;
	
	class InClass { 
		int i1 = a;
		int i2 = b;
	}
	
	static class InStaticClass {
		// int i1 = a;  // 에러가 발생하는데, 그 이유는 static 클래스는 클래스 생성이 되기 이전
		// 부터 로드되어 생성되는데, a 변수는 객체가 생성되어야 생성되는 변수이기 때문이다. 
		int i2 = b;
	}
}

public class Ex3 {

}
