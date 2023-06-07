package object;

class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x = " + x + "," + "y = " + y;
	}
}

class Circle implements Cloneable {  // 객체를 복제해도 된다는 의미로 Cloneable 인터페이스를 구현함
	Point point;
	int radius;
	public Circle(int x, int y, int radius) {
		super();
		this.radius = radius;
		point = new Point(x, y);
	}
	@Override
	public String toString() {
		return "원점은 " + point + "이고," + "반지름은 " + radius + "입니다.";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException { // clone( ) 메서드를 사용할 때 발생할 수 있는 오류를 예외 처리함
		return super.clone();
	}
}

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException { // clone( ) 메서드를 사용할 때 발생할 수 있는 오류를 예외 처리함
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
