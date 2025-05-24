package no04;

public class RoadToBiodome04 {
	public static void main(String[] args)
	{
		int[] arr = new int[100];
		int len = args.length;
		int temp, min, index, index_mid;
		float avr = 0, mid;
		
		index = -1;
		
		if(len <= 0)
		{
			System.out.println("input out");
		}
		
		for(int i = 0; i < len ; i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
		
		for(int i = 0 ; i < len ; i++ )
		{
			min = arr[i];
			
			for(int j = i; j < len ; j++)
			{
				if(min > arr[j])
				{
					min = arr[j];
					index = j;
				}
			}
			
			temp = arr[i];
			arr[i] = min;
			arr[index] = temp;
		}
		
		for(int i = 0; i < len ; i++)
		{
			avr += arr[i];
		}
		
		if(len%2==1)
		{
			index_mid = len/2;
			mid = arr[index_mid];
		}
		
		else
		{
			index_mid = len/2;
			mid = (arr[index_mid] + arr[index_mid+1])/2; 
		}
		
		avr = avr / len;
		

		System.out.print(avr + ", " + mid);
		
		
	}
}
