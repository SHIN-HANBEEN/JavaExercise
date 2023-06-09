package genericsex2;

public class GenericMethodTest1 {
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double bottom = ((Number)p1.getY()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = top - bottom;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Integer> p1 = new Point<Integer, Integer>(0, 0);
		Point<Integer, Integer> p2 = new Point<Integer, Integer>(10, 10);
//		Point<Double, Double> p3 = new Point<Double, Double>(0.0, 0.0);
//		Point<Double, Double> p4 = new Point<Double, Double>(10.0, 10.0);
		
//		double result1 = GenericMethodTest1.<Integer, Integer>makeRectangle(p1, p2);
//		double result2 = GenericMethodTest1.<Double, Double>makeRectangle(p3, p4);
//		double result3 = GenericMethodTest1.<Number, Number>makeRectangle(p1,p2);
		

		
//		System.out.println(result1);
//		System.out.println(result2);
		
	}

}
