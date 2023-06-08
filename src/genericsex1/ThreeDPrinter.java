package genericsex1;

public class ThreeDPrinter {
	private Object material;

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public void doPrint() {
		System.out.println(this.material + " 재료를 사용하여 프린트합니다.");
	}
}
