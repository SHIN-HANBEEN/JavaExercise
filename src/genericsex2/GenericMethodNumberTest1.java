package genericsex2;

public class GenericMethodNumberTest1 {
	public static double makeRectangle(PointNumber p1, PointNumber p2) {
		double left = p1.getX().doubleValue();
		double bottom = p1.getY().doubleValue();
		double right = p2.getX().doubleValue();
		double top = p2.getY().doubleValue();
		
		double width = right - left;
		double height = top - bottom;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		PointNumber p1 = new PointNumber(0, 0);
		PointNumber p2 = new PointNumber(10.0, 10.0);
		double result1 = GenericMethodNumberTest1.makeRectangle(p1,p2);
		System.out.println(result1);
	}

}
