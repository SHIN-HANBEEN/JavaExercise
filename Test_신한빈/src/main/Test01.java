package main;



public class Test01 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
		powderGenericPrinter.setMaterial(new Powder());
		Powder powder = powderGenericPrinter.getMaterial();
		System.out.println(powder);

	}

}

class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
}

class Powder {
	
}