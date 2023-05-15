package exercise;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lineCount = 10;
		int starCount = 1;
		int h = lineCount/2;
		boolean isActivated =false;
		
		for (int i=1; i <=lineCount; i++) {
			if ((lineCount % 2)!=0) {
				if (i<lineCount/2+1) { // 별이 증가하는 부분
					int spaceCount = lineCount - i;
					for (int j=1; j<=spaceCount; j++) {
						System.out.print(" ");
					}
					for (int j=1; j<=starCount; j++) {
						System.out.print("*");
					}
					for (int j=1; j<=spaceCount; j++) {
						System.out.print(" ");
					}
					starCount += 2;
					System.out.println();
				} 
				else { // 별이 감소하는 부분
					if (!isActivated) {
				        // Code to be executed only once
						starCount -= 2;
						h += 2;
				        isActivated = true;
				    }
					starCount -= 2;
					
					for (int j=1; j<=h; j++) {
						System.out.print(" ");
					}
					for (int j=1; j<=starCount; j++) {
						System.out.print("*");
					}
					for (int j=1; j<=h; j++) {
						System.out.print(" ");
					}					
					System.out.println();
					h+=1;
				}
			}
			else {
				if (i<lineCount/2) { // 별이 증가하는 부분
					int spaceCount = lineCount - i;
					for (int j=1; j<=spaceCount; j++) {
						System.out.print(" ");
					}
					for (int j=1; j<=starCount; j++) {
						System.out.print("*");
					}
					for (int j=1; j<=spaceCount; j++) {
						System.out.print(" ");
					}
					starCount += 2;
					System.out.println();
				} 
				else { // 별이 감소하는 부분
					if (!isActivated) {
				        // Code to be executed only once
						starCount -= 2;
						h += 2;
				        isActivated = true;
				    }
					starCount -= 2;
					
					for (int j=1; j<=h; j++) {
						System.out.print(" ");
					}
					for (int j=1; j<=starCount; j++) {
						System.out.print("*");
					}
					for (int j=1; j<=h; j++) {
						System.out.print(" ");
					}					
					System.out.println();
					h+=1;
				}
			}
		}
	}

}
