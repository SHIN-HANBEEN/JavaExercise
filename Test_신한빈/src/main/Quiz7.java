package main;

class Mydate {
	int year;
	int month;
	int day;
	public Mydate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public boolean equals(Object obj) {
		Mydate mydate = (Mydate)obj;
		if (this.year==mydate.year && this.month==mydate.month && this.day==mydate.day) {
			return true;
		} else {
			return false;
		}
	}
}

public class Quiz7 {

	public static void main(String[] args) {
		Mydate date1 = new Mydate(2023, 6, 7);
		Mydate date2 = new Mydate(2023, 6, 7);
		if(date1.equals(date2)) {
			System.out.println("date1과 date2는 같은 날짜입니다.");
		} else {
			System.out.println("date1과 date2는 같은 날짜가 아닙니다.");
		}
		
		Mydate date3 = new Mydate(2023, 1, 7);
		Mydate date4 = new Mydate(2023, 2, 7);
		if(date3.equals(date4)) {
			System.out.println("date3과 date4는 같은 날짜입니다.");
		} else {
			System.out.println("date3과 date4는 같은 날짜가 아닙니다.");
		}
		
	}

}
