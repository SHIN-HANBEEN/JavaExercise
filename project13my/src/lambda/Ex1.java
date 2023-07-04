package lambda;

@FunctionalInterface
interface MyNumber {
	int add(int num1, int num2);
}

public class Ex1 {

	public static void main(String[] args) {
		MyNumber number = (x, y) -> x+y;
		System.out.println(number.add(10, 20));
	}

}
