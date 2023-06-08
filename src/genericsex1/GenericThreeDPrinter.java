package genericsex1;

public class GenericThreeDPrinter<T extends Material> {
	private T material;
	
	public GenericThreeDPrinter(T material) {
		super();
		this.material = material;
	}

	public T getMaterial() {
		return material;
	}

//	public void setMaterial(T material) {
//		this.material = material;
//	} // 생성자에서 material 설정하는 것으로 대체
	
	public void doPrint() {
		System.out.println(this.material + " 재료를 사용하여 프린트합니다.");
	}
}
