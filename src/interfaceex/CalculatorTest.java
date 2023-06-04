package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();  // 디폴트 메서드 + 디폴트 메서드에 포함된 private 메서드 실행됨
		int[] arr = {1, 2, 3, 4, 5};
		Calc.total(arr);  // default(정적, static) 메서드에서 private static 메서드 실행
		
	}

}
