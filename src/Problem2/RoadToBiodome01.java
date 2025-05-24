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
		List<Integer> countlist = new ArrayList<>();
		
		for(int i  = 0; i<input.size();i++)
		{
			int x = input.get(i);
			if(result.contains(x)) { //num exist already
				int x_index = result.indexOf(x);
				countlist.set(x_index, countlist.get(x_index)+1);
			}
			else{				 	//num doesn't exist
				result.add(x);
				countlist.add(0);
			}
		}
			
		//print
		for(int i = 0; i<result.size(); i++) {
			if(countlist.get(i)==0) {
				System.out.print(result.get(i)+ " ");
			}
		}
	}
}
