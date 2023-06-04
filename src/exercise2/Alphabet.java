package exercise2;
import java.util.ArrayList;

public class Alphabet {

	public static void main(String[] args) {
		char c1 = 'A';
		ArrayList<Character> charList = new ArrayList<Character>();
		
		for (int i = 65; i < 97+32; i++, c1++) {
			charList.add(c1);
		}
		
		System.out.println(charList);
		
		for (int i=0; i < charList.size(); i++) {
			System.out.println((int)charList.get(i));
		}
	}

}
