package Problem2;

import java.util.*;

public class RoadToBiodome05 {
	
	public static int partition(List<Integer> list,int left, int right) {
		int low = left+1, high = right, pivot = list.get(left);
		
		while(low<=high) {
			if(list.get(low)>pivot) {
				Collections.swap(list,low,high);
				high--;
			}
			else {
				//Collections.swap(list,low,high);
				low++;
			}
		}
		Collections.swap(list,left,high);
		
		return high;
	}
	
	public static void quickSort(List<Integer> list,int left, int right)
	{
		if(left<right)
		{
			int pivot = partition(list,left,right);
			
			quickSort(list,left,pivot-1);
			quickSort(list,pivot+1,right);
		}
		return ;
	}
	
	
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("please, write at least one ");
			return;
		}
		
		//String input -> Integer list
		List<Integer> input = new ArrayList<>();
		for(int i = 0; i<args.length; i++){
			int x = Integer.parseInt(args[i]) ;
			input.add(x);
		}
		
		quickSort(input,0,input.size()-1);
		
		System.out.println(input);
	}
}
