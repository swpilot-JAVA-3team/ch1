package 과정2;

public class RoadToBiodome05 {
	public static void main(String[] args)
	{
		// 분리
		String input = String.join("", args);

		String inputSplit[]  = input.split("[\\[\\],]");
		int inputInt[] = new int[inputSplit.length]; 
		
		int j = 0;
		for(int i=0;i<inputSplit.length;i++)
		{
			
			try 
			{
				inputInt[j++] = Integer.parseInt(inputSplit[i]);
			}catch(NumberFormatException e)
			{
				j--;
			}
		}
		Qsort(inputInt,0,j-1);
		for(int i=0;i<j;i++)
		{
			System.out.print(inputInt[i] + " ");
			
		}
		
		
	}
	public static void Qsort(int[] arr, int left, int right)
	{
	    int i, j, pivot;

	    if (left < right)
	    {
	        i = left;
	        j = right + 1;
	        pivot = arr[left];

	        do
	        {
	            do {
	                i++;
	            } while (i <= right && arr[i] < pivot); 
	            do {
	                j--;
	            } while (j >= left && arr[j] > pivot);

	            if (i < j)
	                SWAP(arr, i, j);
	        } while (i < j);

	        SWAP(arr, left, j);

	        Qsort(arr, left, j - 1);
	        Qsort(arr, j + 1, right);
	    }
	}

	
	public static void SWAP(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
