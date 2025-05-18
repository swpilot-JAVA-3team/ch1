package HelloBiodome08;

import java.util.Arrays;
import java.util.Comparator;

public class HelloBiodome08 {
	public static void main(String[] args)
	{	
		int[] flag = new int[200];
		int min = 999;
		int temp = 0;
		
		String[] word = new String[] {"hello", "where", "this", "biodome", 
				"help", "tree", "new", "is", "problem", 
				"please", "need", "we", "isn’t","there", 
				"a", "your", "any", "thanks", "the", "for", 
				"solution", "can", "?"};
		
		Arrays.sort(word, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});
		
		StringBuilder sen = new StringBuilder();
		if(args.length > 0)
		{
			for (String arg : args)
			{
				sen.append(arg);
			}
		}
		
		for (String item : word) {
		    int index = sen.indexOf(item);

		    if(index > -1 && flag[index] != 1) {
		        sen.insert(index + item.length(), " ");

		        for(int i = 0; i < item.length(); i++) {
		            flag[index + i] = 1;
		        }

		        if(min > index) {
		            min = index;
		            int len = sen.length();
		            for (int i = len - 2; i >= min; i--) {
		                flag[i + 1] = flag[i];
		            }
		        }
		    }
		}
		
		int qIndex = sen.indexOf(" ?");
		while (qIndex != -1) {
		    sen.deleteCharAt(qIndex);
		    qIndex = sen.indexOf(" ?", qIndex); 
		}

		sen = new StringBuilder(sen.toString().trim());
		if (!sen.toString().endsWith("?")) {
		    sen.append(".");
		}

		System.out.println(sen);
		
	}
}
