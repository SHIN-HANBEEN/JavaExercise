package lambda;

@FunctionalInterface
interface MyNumber2 {
	int add(int num1, int num2);
}

public class Ex2 {
	public static void main(String[] args) {
		//MyNumber number = (x, y) -> x + y;
		MyNumber2 number2 = new MyNumber2() {
			@Override 
			public int add(int x, int y) {
				return x+y;
			}
		};
		// 람다식을 사용하지 않으니까 코드가 훨씬 길어진 것을 볼 수 있다.
		
		System.out.println(number2.add(10, 20));
	}
}
