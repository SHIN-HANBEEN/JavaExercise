package generics;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		
		Powder p1 = new Powder();
		printer.setMaterial(p1);  // Object material = Powder p1; 자동형변환
		
		Powder p2 = (Powder)printer.getMaterial(); // Object 형으로 자동형변환 된 값을 다운캐스팅 하여 대입해야 하기 때문에 직접 형 변환을 해야 함.
		
		var list = new ArrayList<String>();
	}
}
