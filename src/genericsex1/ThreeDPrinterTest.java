package genericsex1;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		printer.setMaterial(powder);
		printer.doPrint();
		Powder powder2 = (Powder)printer.getMaterial(); // 직접 형변환을 해서 Powder 를 가져와야한다.
		System.out.println(powder2);
		
		printer.setMaterial(plastic);  // Object로 자료형을 사용하며 재밌는 점인데, printer 객체를 하나만 생성한 다음 setMaterial을 활용해서 수정해주면 된다. 
		printer.doPrint();
		Plastic plastic2 = (Plastic)printer.getMaterial();
		System.out.println(plastic2);
		
	}

}
