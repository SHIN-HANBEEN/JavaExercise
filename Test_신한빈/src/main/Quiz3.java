package main;

class Pen {
	int thickness;
	int remainning;
	public Pen(int thickness, int remainning) {
		super();
		this.thickness = thickness;
		this.remainning = remainning;
	}
	
}

class BallPen extends Pen {
	String color;

	public BallPen(int thickness, int remainning, String color) {
		super(thickness, remainning);
		this.color = color;
	}
	
}

class ManPen extends Pen {
	String brand;

	public ManPen(int thickness, int remainning, String brand) {
		super(thickness, remainning);
		this.brand = brand;
	}

	
	
}

public class Quiz3 {

	public static void main(String[] args) {
		BallPen pen1 = new BallPen(2, 100, "파랑색");
		ManPen manPen1 = new ManPen(3, 80, "몽블랑");
	}

}
