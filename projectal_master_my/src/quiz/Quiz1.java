package quiz;

// 변수 x 을 선언하고 25 대입
//변수 y 를 선언하고 40 대입 
//두 변수 갑 바꾸기
public class Quiz1 {
	
	public static void main(String[] args) {
		int x; // x는 25를 대입 받는 변수
		int y; // y는 40을 대입 받는 변수
		int mediator; // mediator는 값을 바꿀 때 값을 받는 변수
		
		x = 25;
		y = 40;
		mediator = x;
		x = y;
		y = mediator;
		
		System.out.println(x);
		System.out.println(y);
	}

}
