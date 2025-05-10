package 과정1;

public class HelloBiodome06 {
	public static void main(String[] args)
	{
		String gene1, gene2;
		
		try
		{
			gene1 = args[0];
			gene2 = args[1];
			
			if(gene1.length()!=gene2.length())
			{
				System.out.println("-> 일치하지 않습니다.");
				System.exit(0);
			}
			int length = gene1.length();
			int index = 0;
			
			boolean result = true; // 기본 초기화
			while(index<length)
			{
				if(gene1.charAt(index)!=gene2.charAt(index))
				{
					result = false;
					break;
				}
				index++;
			}
			
			// 결과 출력
			if(result)
			{
				System.out.println("-> 동일한 유전자 코드입니다.");

			}
			
			else
			{
				System.out.println("-> 일치하지 않습니다.");				
			}
			
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("-> 두 개의 유전자 코드를 입력해주세요.");
			System.exit(1);
		}
	}
}
