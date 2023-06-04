package array;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int [] array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array1, 0, array2, 1, 4);
		System.out.println(Arrays.toString(array2));
		
	}
}
