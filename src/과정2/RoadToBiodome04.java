package 과정2;

public class RoadToBiodome04 {
	
	public static double findAverage(int arr[])
	{
		float sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		double average = sum / arr.length;
		
		return average;
	}
	
	public static double findMidValue(int arr[])
	{
		int index = arr.length/2;
		if(arr.length%2==1) { //홀수일 경우
			return arr[index];			
		}else {
			double result = (arr[index-1] + arr[index]) / 2.0;
			return result;
		}
		
	}
	
	public static void main(String[] args)
	{
		// 배열 할당
		int arr[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			try {
				arr[i] = Integer.parseInt(args[i]);
			}catch(NumberFormatException e){
				System.out.println("숫자를 제대로 입력하세요.");
				System.exit(1);
			}
			
			
		}
		// 오름차순 정렬
		int temp;
		for(int i=0;i<args.length-1;i++) 
		{
			for(int j=0;j<args.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		double average = findAverage(arr);
		double midValue = findMidValue(arr);
		
		System.out.printf("평균값: %f, 중앙값: %f", average,midValue);
	}
	
	
}
