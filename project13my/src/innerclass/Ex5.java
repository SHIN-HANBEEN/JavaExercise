package innerclass;

class RunnableChild implements Runnable {
	@Override
	public void run() {
		System.out.println("running...");
	}
}
// Runnable 은 jdk 에서 제공하는 기본 클래스 중 하나인데, 테스트를 위한 클래스이다. 
// lang 패키지에 있는데, lang 패키지는 항상 자동 import 된다. 

public class Ex5 {

	public static void main(String[] args) {
		Runnable child = new RunnableChild();
		child.run();
		// 우리가 흔히 사용하는 클래스의 객체를 만들어서 사용했다.
		
		Runnable runnerble = new Runnable() {
			@Override
			public void run() {
				System.out.println("running...");
			}
		};
		// 익명 클래스를 사용해서 상속 받는 클래스 없이 바로 사용했다. 
		runnerble.run();
		// 위 코드는 실행되지 않은 것을 확인할 수 있다. 
	}
}
