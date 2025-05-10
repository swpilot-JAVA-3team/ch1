package 과정1;

public class HelloBiodome02 {
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i=0;i<3;i++)
		{
			try
			{
				int k = Integer.parseInt(args[i]); // 값 저장
				sum += k;
			}catch(NumberFormatException e)
			{
				System.out.println("Error!: "+e.getMessage());
				System.exit(1);			}
		}
		
		System.out.printf("-> 총에너지 사용량: %d 입니다\n",sum);
		
	}
}
