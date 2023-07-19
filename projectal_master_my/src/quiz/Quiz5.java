package quiz;

// reverse 함수는 문자열을 거꾸로 출력합니다. 
public class Quiz5 {

	public static void main(String[] args) {
		char[] arr = {'안', '녕', '하', '세', '요'};
		reverse(arr);
	}
	
	public static void reverse(char[] arr) {
		char[] newarr = new char[arr.length]; // arr 을 반대 순서로 받을 새로운 배열
		for (int i = 0, j = arr.length-1; i < arr.length; i++,j--) {
				newarr[j] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(newarr[i]);
		}
	}
}


//package quiz;
//
////reverse 함수는 문자열을 거꾸로 출력합니다. 
//public class Quiz5 {
//
//	public static void main(String[] args) {
//		String str = "안녕하세요";
//		reverse(str);
//	}
//	
//	public static void reverse(String str) {
//		for (int i = str.length()-1; i >= 0; i--) {
//			System.out.println(str.charAt(i) + " ");
//		}
//	}
//}
