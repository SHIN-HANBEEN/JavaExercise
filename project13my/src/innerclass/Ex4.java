package innerclass;

class OutClass2 {
	private int a = 10;
	static int b = 20;
	
	class InClass {
		int i1 = a; // 외부 클래스의 private 멤버도 사용 가능
		int i2 = b; // static 변수도 인스턴스 내부 클래스에서 당연히 사용 가능
	}
	
	static class InStaticClass {
		int i2 = b; // static 내부 클래스에서는 외부 클래스의 static 변수만 사용 가능
	}
	
	public void change() {
		a = 20;
	}
	
	void method() {
		int i = 100;
		
		class LocalInner { // 지역 내부 클래스
			void innerMethod() {
//				  i = 200; // 오류가 발생한다. i 는 final 상수이기 때문이다. 
			}
		}		
	}
}

public class Ex4 {
	public static void main(String[] args) {
		OutClass2 a1 = new OutClass2();
		a1.change();
		System.out.println(a1.b);
	}
}
