package innerclass;

class Outer {
	int a = 10;
	
	class Inner {
		int b = 100;
		int c = 200;
		
		public void method1() {
			System.out.println(a);
		}
	}
}
// 내부 클래스에서는 외부 클래스 생성 없이 멤버를 그냥 사용할 수 있다. 


public class Ex2 {

}
