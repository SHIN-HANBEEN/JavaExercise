package genericsex2;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> PowderPrinter = new ThreeDPrinter<>(new Powder());
		ThreeDPrinter<Plastic> PlasticPrinter = new ThreeDPrinter<>(new Plastic());
		
		PowderPrinter.doPrint();
		PlasticPrinter.doPrint();
		
		Powder powder1 = PowderPrinter.getMaterial();
		Plastic plastic1 = PlasticPrinter.getMaterial();
		System.out.println(powder1);
		System.out.println(plastic1);
	}

}
