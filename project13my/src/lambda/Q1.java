package lambda;

@FunctionalInterface 
interface largerNumber {
	public int max(int i1, int i2);
}

public class Q1 {
	public static void main(String[] args) {
		// 분기문 활용 & 람다식 활용
		largerNumber l1 = (i1, i2) -> {
			if (i1 < i2) {
				return i2;
			} else if (i1 == i2) {
				return -999;
			} else {
				return i1;
			}
		};
		
		// 삼항 연산자 활용 & 익명 클래스로 인터페이스 구현
		largerNumber l2 = new largerNumber() {
			@Override
			public int max(int i1, int i2) {
				return i1>i2? i1:i2;
			}
		};
		
		// 삼항 연산자 활용 & 람다식 활용
		largerNumber l3 = (x, y) -> x>y? x:y;
		
		System.out.println(l1.max(10, 20));
		System.out.println(l2.max(10, 20));
		System.out.println(l3.max(10, 20));
	}
}
