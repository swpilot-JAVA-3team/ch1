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
		
		int i = 0;  // 입력받은 문장을 검토할 때 사용될 인덱스
		
		
		while (i < input.length()) {
			boolean found = false;
			for (String choose_dict : dict) {  // 사전에서 단어를 하나씩 가져와서 choose_dict에 넣음
				int dict_length = choose_dict.length(); 

				int correct_count = 1;  // 입력문장과 사전단어의 위치를 비교할 인덱스
				
				if (input.charAt(i) == choose_dict.charAt(0)) {   // 입력문장에서 비교할 첫 알파벳과 사전단어의 첫 알파벳을 비교
					
					for (int dict_index = 1; dict_index < dict_length; dict_index++) {    // (사전단어의 첫 알파벳은 검사했으므로) 사전단어의 두 번째 알파벳부터 마지막 알파벳까지만큼 반복
						if (input.charAt(i + dict_index) == choose_dict.charAt(dict_index)) {  // 알파벳 자리수마다 서로 동일한 알파벳인지 검사
							
							correct_count++;
							
						} else {
							break;  // 알파벳이 서로 다르면 중단
						}
					}
					if (dict_length == correct_count) {   // 입력문장과 사전단어의 알파벳이 처음부터 끝까지 모두 동일하면
						if (stringBuild.length() > 0 && stringBuild.charAt(stringBuild.length() - 1) != ' ' 
							    && !choose_dict.equals("?")) {   // 바로 앞 자리가 공백이 아니면 공백 추가(사전에 없는 단어는 공백을 추가하지 않으므로)
							stringBuild.append(" ");
						}
						
						stringBuild.append(choose_dict);
						i += dict_length;   // 사전단어 글자수만큼 입력문장에서 검사할 인덱스를 증감
						found = true;
						if (i != input.length() - 1) {  // 입력문장의 마지막 단어가 아니면
							stringBuild.append(" ");  // append한 단어 끝에 공백 추가
						}
						break;
					}
				}
			}
			if (!found) {  // 사전에서 하나도 찾지 못했다면
				stringBuild.append(input.charAt(i));
				i++;  // 입력문장에서 검사할 인덱스를 한 자리만 증감
			}
		}
		
		if (stringBuild.charAt(stringBuild.length() - 1) == ' ') stringBuild.deleteCharAt(stringBuild.length() - 1);  // 문장의 마지막에 공백이 있다면 제거
		if (!input.toString().endsWith("?")) stringBuild.append(".");  // 입력 문장이 ?로 안 끝났었다면 마지막에 .를 추가
        
		
		System.out.println(stringBuild);
	}
}

