package genericsex2;

public class ThreeDPrinter<T extends Material> {
	T material;
	
	public ThreeDPrinter(T material) {
		super();
		this.material = material;
	}

	public T getMaterial() {
		return material;
	}

	public void doPrint() {
		System.out.println(material + "을 사용하여 Print합니다.");
	}
}
