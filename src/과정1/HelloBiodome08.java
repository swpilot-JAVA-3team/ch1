package 과정1;

public class HelloBiodome08 {
	public static void main(String[] args)
	{
		String dictionary[] = { "hello","where","this","biodome"
		                        ,"help", "tree", "new", "is", "problem"
		                        , "please", "need", "we", "isn’t","there"
		                        , "a", "your", "any", "thanks", "the", "for"
		                        , "solution", "can", "?" };
		
		StringBuilder input = new StringBuilder();
		input.append(args[0]); // 사용자 입력
		
		for(int i=0;i<dictionary.length;i++)
		{
			int index = input.indexOf(dictionary[i]);
			if(index!=-1) // 단어가 있을 경우
			{
				if(dictionary[i]=="?"&&index==input.length()-1) // ? index가 마지막일 경우
					continue;
				input.insert(index," ");
			}
		}
		
		System.out.println(input);
	}
}
