package generics;

public class GenericPrinter<T extends Material> {  // 제네릭 클래스를 만들기 위해 다이아몬드 연산자 사용, T 는 type 의 약자로 자료형 매개변수로 사용한다는 것을 의미함
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
}
