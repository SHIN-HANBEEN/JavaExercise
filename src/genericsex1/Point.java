package genericsex1;

public class Point <T, V> {
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {  // T 자료형 매개변수를 반환하는 제네릭 메서드입니다. 
		return x;
	}

	public V getY() {  // V 자료형 매개변수를 반환하는 제네릭 메서드입니다. 
		return y;
	}
}
