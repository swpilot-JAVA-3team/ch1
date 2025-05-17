import java.util.*;

public class HelloBiodome08 {
	
	
	
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("please, write at least one word");
		}
		
		String str = args[0];
		String[] dic = {
			    "hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please", "need",
			    "we", "isn’t", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can", "?", "you"
			}; 
		Arrays.sort(dic,Comparator.reverseOrder());
		
		StringBuilder result = new StringBuilder();
		int i = 0;
		
		
		while(i < str.length())
		{
			boolean flag = false;
			
			for(String word : dic) {
				int word_end = i + word.length();
				if(word_end <= str.length())
				{
					String tmp = str.substring(i,word_end);
					if(tmp.equals(word))
					{
						if(word.equals("?"))
						{
							result.append("?");
						}
						else {
							result.append(word).append(" ");
						}
						i+= word.length();
						flag = true;
						break;
					}
				}
				
			}
			 if (!flag) {
	                // 단어 사전에 없는 글자 → 붙이되 띄어쓰기 구분되도록 처리
	                StringBuilder unknown = new StringBuilder();
	                while (i < str.length()) {
	                    boolean found = false;
	                    for (String word : dic) {
	                        int end = i + word.length();
	                        if (end <= str.length() && str.substring(i, end).equals(word)) {
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (found) break;
	                    unknown.append(str.charAt(i));
	                    i++;
	                }
	                result.append(unknown).append(" ");
	            }
		}
		if (!str.endsWith("?")) {
            result.setLength(result.length() - 1);  // 마지막 공백 제거
            result.append(".");
        }
		System.out.println(result.toString());
	}

	
}
