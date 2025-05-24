package Problem2;

import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome02 {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("please, write a sentence ");
			return;
		}
		
		List<Character> charStack = new ArrayList<>();
		for(String input : args) {
			for(int i = 0; i<input.length();i++) {
				charStack.add(input.charAt(i));
			}
			charStack.add(' ');
		}
		
		charStack.remove(charStack.size()-1);
		while(!charStack.isEmpty()) {
			Character lastc = charStack.remove(charStack.size()-1);
			System.out.print(lastc);
		}
		return;
	}
}
