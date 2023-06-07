package gamelevel;

import generics.GenericPrinter;
import generics.Plastic;
import generics.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // object 를 사용했을 때와는 달리 명시적 형 변환을 하지 안항도 괜찮음
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
	}
}
