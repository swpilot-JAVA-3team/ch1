package Problem2;

import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome06 {
	
	public static double Avg(List<Integer> list1, List<Integer> list2) {
		double result=0;
		int n = list1.size(), m = list2.size();
		int i = 0;
		
		while(i<n || i<m) {
			if(i<n) result += (double)list1.get(i);
			if(i<m) result += (double)list2.get(i);
			i++;
		}
		
		result /= (double)m+n;
		
		return result;
	}
	
	public static double Mid(List<Integer> list1, List<Integer> list2)
	{	int n = list1.size(), m = list2.size();
		int i=0 ,j=0, p;
		
		double result = 0.0;
		if((n+m)%2 == 0) { //even
			int mid = (n+m)/2 -1; int tmp = 0;
			for(int cnt = 0; cnt<=mid+1;cnt++) {
				if(list1.get(i)<=list1.get(j)) i++;
				else j++;
				if(cnt==mid) {
					tmp = (list1.get(i)<=list2.get(j)) ? list1.get(i) : list2.get(j);
				}
			}
			result = (list1.get(i)<=list2.get(j)) ? (double)list1.get(i) : (double)list2.get(j);
			result = (result + (double)tmp)/2;
			
		}
		else {					 //odd
			int mid = (n+m)/2;
			for(int cnt = 0; cnt<mid;cnt++) {
				if(list1.get(i)<=list1.get(j)) {
					i++;
				}
				else {
					j++;
				}
			}
			result = (list1.get(i)<=list2.get(j)) ? (double)list1.get(i) : (double)list2.get(j);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.add(2);	list1.add(1);
		list1.add(4);	list1.add(3);
		list1.add(5);	list1.add(6);
		
		double mid;
		mid = Mid(list1, list2);
		System.out.println(mid);
	}
}
