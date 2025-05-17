package javacc;
import java.util.Arrays;

public class HelloBiodome08 {

	public static void main(String[] args) {
		if (args.length == 0) {
            System.out.println("메시지를 입력하세요.");
            return;
        }

		StringBuilder input = new StringBuilder(args[0].toLowerCase());
        if (input.length() > 100) {
            System.out.println("메시지 길이는 최대 100자입니다.");
            return;
        }
		
		
		String[] dict = {"hello", "where", "this", "biodome", 
				"help", "tree", "new", "is", "problem", "please", 
				"need", "we", "isn't", "there", "a", "your", "any", 
				"thanks", "the", "for", "solution", "can", "?"};
		
		Arrays.sort(dict);
		
		for (int i = 0; i < dict.length - 1; i++) {
            for (int j = i + 1; j < dict.length; j++) {
                if ((dict[j].length() > 1) && (dict[i].charAt(0) == dict[j].charAt(0)) 
                		&& (dict[i].length() < dict[j].length())) {
                    String temp = dict[i];
                    dict[i] = dict[j];
                    dict[j] = temp;
                }
            }
        }
		
		StringBuilder stringBuild = new StringBuilder();
		
		int i = 0;
		
		
		while (i < input.length()) {
			boolean found = false;
			for (String choose_dict : dict) {
				int dict_length = choose_dict.length(); 
				//System.out.println(dict_length);
				int correct_count = 1;
				
				if (input.charAt(i) == choose_dict.charAt(0)) {
					
					
					for (int dict_index = 1; dict_index < dict_length; dict_index++) {
						if (input.charAt(i + dict_index) == choose_dict.charAt(dict_index)) {
							
							correct_count++;
							
						} else {
							break;
						}
					}
					if (dict_length == correct_count) {
						stringBuild.append(choose_dict);
						i += dict_length;
						found = true;
						if (i != input.length() - 1) {
							stringBuild.append(" ");
						}
						break;
					}
				}
			}
			if (!found) {
				stringBuild.append(input.charAt(i));
				i++;
			}
		}
		
		if (stringBuild.charAt(stringBuild.length() - 1) == ' ') stringBuild.deleteCharAt(stringBuild.length() - 1);
		if (!input.toString().endsWith("?")) stringBuild.append(".");
        
		
		System.out.println(stringBuild);
	}
}

