package 과정2;

import java.util.HashMap;
import java.util.Map;

public class RoadToBiodome07 {
	public static void main(String[] args)
	{
		// input 정리
		String input = String.join("", args);
		String [] inputArrays = input.replace("\"","" ).replace("[","").replace("]", "").split(",");
		
		// hashMap 사용
		Map<String,Integer> animal = new HashMap<String,Integer>();
		
		for(int i=0;i<inputArrays.length;i++)
		{
			String key = inputArrays[i];
			if(animal.containsKey(key))
			{
				int value = animal.get(key);
				value +=1;
				animal.replace(key, value);
			}else {
				animal.put(inputArrays[i],1);
			}
		}
	
		// Map.Entry 배열로 변환
        @SuppressWarnings("unchecked")
		Map.Entry<String, Integer>[] entries = animal.entrySet().toArray(new Map.Entry[0]);
        Qsort(entries,0,entries.length-1);
        
        for (int i = 0; i < entries.length - 1; i++)
        {
            for (int j = 0; j < entries.length - 1 - i; j++) 
            {
                if (entries[j].getValue().equals(entries[j + 1].getValue())) 
                {
                    if (entries[j].getKey().compareTo(entries[j + 1].getKey()) > 0)
                    {
                        // swap
                        Map.Entry<String, Integer> temp = entries[j];
                        entries[j] = entries[j + 1];
                        entries[j + 1] = temp;
                    }
                }
            }
        }
        
        for(int i=0;i<entries.length;i++)
        {
        	System.out.printf("%s ", entries[i].getKey());
        }
        
        
	}
	

	public static void Qsort(Map.Entry<String, Integer>[] arr, int left, int right)
	{
		int i,j, pivot;
		i = left;
		j = right+1;
		if(left<right)
		{
			pivot = arr[left].getValue();
			do
			{
				do i++;while(i <= right &&arr[i].getValue()>pivot);
				do j--;while(j >= left&&arr[j].getValue()<pivot);
				if(i<j) swap(i,j,arr);
			}while(i<=j);
			swap(left,j,arr);
			Qsort(arr,left,j-1);
			Qsort(arr,j+1,right);
		}
	}
	
	public static void swap(int a, int b,  Map.Entry<String, Integer>[] arr)
	{
		Map.Entry<String, Integer> temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
