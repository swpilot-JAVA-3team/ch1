package Problem2;

import java.util.*;

public class RoadToBiodome04 {
	
	public static List<Integer> InputToList(String[] input) { //입력값-> 리스트형변환
		for(int i = 0; i<input.length; i++) {
			input[i] = input[i].replace("[", "").replace(",", "").replace("]", "").replace("\"", "");

		}
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<input.length; i++){
			int x = Integer.parseInt(input[i]) ;
			list.add(x);
		}
		
		
		return list;
		
	}
	
	public static List<Integer> selectionSort(List<Integer> list) {
		for(int i = 0; i<list.size()-1; i++)
		{
			int min_index = i;
			for(int j = i+1; j<list.size(); j++)
			{
				if(list.get(j)<list.get(min_index)) {
					min_index = j;
				}
			}
			Collections.swap(list,i,min_index);
		}
		return list;
	}
	
	public static double Avg(List<Integer> list) {
		double result=0;
		
		for(int i = 0; i<list.size(); i++)
		{
			result += (double)list.get(i);
		}
		result /= list.size();
		
		return result;
	}
	
	public static double Middle(List<Integer> list)
	{
		double result = 0;
		if((list.size()%2) == 0) { //even
			int i = list.size()/2;
			result = (double)(list.get(i)+ list.get(i-1))/2.0;
		}
		else {					 //odd
			int i = (int)(list.size()/2);
			result = (double)list.get(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("please, write at least one ");
			return;
		}
		
		//String input -> Integer list
		List<Integer> input = new ArrayList<>();
		input = InputToList(args);
		
		input = selectionSort(input);
		
		System.out.println(input);
		
		double avg, mid;
		avg = Avg(input);
		mid = Middle(input);
		
		System.out.println("avg: "+avg);
		System.out.println("mid: "+mid);
		
		
	}
	
}
