package wrapper;

public class IntegerWrapper {

	public static void main(String[] args) {
		Integer iValue = new Integer(100);
		int myValue = iValue.intValue();
		System.out.println(myValue);
		
		Integer number1 = Integer.valueOf(100);
		Integer number2 = Integer.valueOf("100");
		System.out.println(number1);
		System.out.println(number2);
		
		int num = Integer.parseInt("100");
		System.out.println(num);
		
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1 + num2;  // Integer 형과 int 형이 연산을 하면 Integer 형이 .intValue( ) 메서드를 활용해서 언박싱을 하여 연산한다. 
		Integer num3 = num2; // int 형을 Integer 형에 대입하려고 할 때 Integer.valueOf(int) 가 동작하여 Integer 형으로 자동 변환하여 대입핸다. (오토박싱)
		
		System.out.println(sum);
		System.out.println(num3);
	}

}
