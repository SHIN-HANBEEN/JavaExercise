package hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (this.month == 2) {
			if (this.day < 1 || day > 28) {
				System.out.println("날짜 범위 오류입니다.");
			} else {
				this.day = day;
			}
		}
	}
}
