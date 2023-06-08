package genericsex1;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {
		GenericThreeDPrinter<Powder> PowderPrinter = new GenericThreeDPrinter<>(new Powder());
		GenericThreeDPrinter<Plastic> PlasticPrinter = new GenericThreeDPrinter<>(new Plastic());
		
		PowderPrinter.doPrint();
		PlasticPrinter.doPrint();
		
		Powder powder = PowderPrinter.getMaterial(); // 강제 형 변환이 필요가 없다. 
		Plastic plastic = PlasticPrinter.getMaterial();
		
		System.out.println(powder);
		System.out.println(plastic);
	}

}
