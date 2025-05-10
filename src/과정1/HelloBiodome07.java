package 과정1;

public class HelloBiodome07 {
	
	public static String compress(String line, int length)
	{
		char current = ' ';
		int count = 0;
		
		String result = " ";
		
		for(int i=0;i<length;i++)
		{
			char ch = line.charAt(i);
			if(current!=ch) // 다른 문자일 경우
			{
				if(count!=0)  // 앞에 다른 문자가 있었을 경우
				{
					result += current;
					result +=  Integer.toString(count);
					count = 0;
				}
				current = ch; 
				count++;
			}
			else // 같은 문자일 경우
			{
				count++;
			}
		}
		
		// 마지막 문자
		result += current;
		result += count;
		
		// 결과
		return result;
		
		
	}
	
	public static void main(String[] args)
	{
		String gene; 
		try
		{
			String args_line = String.join("", args);
			gene = args_line;
			gene = gene.toUpperCase();
			String result = compress(gene, gene.length());
			
			System.out.println("-> " + result);
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("-> 염기서열이 입력되지 않았습니다.");
			System.exit(1);
		}
		
		
	}
	
	
}
