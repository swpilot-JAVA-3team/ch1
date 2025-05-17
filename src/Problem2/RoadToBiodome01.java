package Problem2;

import java.util.*;
public class RoadToBiodome01 {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("please, write at least one ");
		}
		
		List<Integer> input = new ArrayList<>();
		for(int i = 0; i<args.length; i++){
			int x = Integer.parseInt(args[i]) ;
			if(x<0 && x>1000) {
				System.out.println("invalid number");
				return;
			}
			input.add(x);
		}
		
		
		//
		List<Integer> result = new ArrayList<>();
		List<Integer> trash = new ArrayList<>();
	}
}
