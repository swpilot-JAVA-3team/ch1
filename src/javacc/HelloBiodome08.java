package javacc;

public class HelloBiodome08 {

	public static void main(String[] args) {
		if (args.length == 0) {
            System.out.println("메시지를 입력하세요.");
            return;
        }

        String input = args[0];
		
		
		StringBuilder sb = new StringBuilder();
		String[] words = {"hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please", "need", "we", "isn't", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can", "?"};
		for (String word : words) {
		    sb.append(word).append(" ");
		}
		
		
	}

}
