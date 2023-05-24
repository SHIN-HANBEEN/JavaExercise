package exercise2;

public class InstanceVariables {
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		
		result = test1();
		System.out.println(result);
		i = 10;
		System.out.println(i);
	}
	
	public static int test1() {
		i = 1;
		return i;
	}
}
