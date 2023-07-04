package main;

public class Quiz1 {

	public static void main(String[] args) {
		int[] intList = {10, 15, 20, 25, 30};
		int sum = 0;
		for (int i=0; i<intList.length; i++) {
			sum += intList[i];
		}
		System.out.println(sum);
	}

}
