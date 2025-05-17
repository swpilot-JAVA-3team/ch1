package 과정2;

public class RoadToBiodome01 {
	public static void main(String[] args)
	{
		int arr[] = new int[1001];
		
		for(int i=0;i<1001;i++)
		{
			arr[i] = 0;  // 총 갯수 초기화
		}
		
		int n;
		for(int i=0;i<args.length;i++) 
		{
			try {
				n = Integer.parseInt(args[i]);
				try {
					arr[n]++;					
				}catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
					System.exit(1);
				}
			}catch(NumberFormatException e) {  // 숫자가 아닐 경우
				System.out.println(e.getMessage()); 
			}	
		}
		
		for(int i=0;i<1001;i++) {
			if(arr[i]==1)
			{
				System.out.printf("%d ",i);	
			}
		}
	}
}
