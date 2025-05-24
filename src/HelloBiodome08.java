public class HelloBiodome08 {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder(args[0]);
        System.out.println(line);
        String[] words = {"hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please", "need", "we", "isn't", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can"};

        // 사전 정렬
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words.length - i - 1; j++){
                if (words[j].length() < words[j + 1].length()){
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        int flag = 0;
        int notwords = 0;
        int i = 0;
        while (i < line.length()){
            flag = 0;
            for (String word : words){
                if (word.length() + i <= line.length() ){
                    String sub = line.substring(i, i + word.length());
                    if(sub.equals(word)){
                        if (notwords == 1) result.append(" ");
                        notwords = 0;
                        result.append(word + " ");
                        flag = 1;
                        i += word.length();
                        break;
                    }
                }
            }
            if (flag == 0){
                result.append(line.charAt(i));
                notwords = 1;
                i++;
            }
        }

        if (result.charAt(result.length() - 1) == '?') {
            if (result.charAt(result.length() - 2) == ' ') {
                result.deleteCharAt(result.length() - 2);
                System.out.println("->" + result);
            }
            else System.out.println("->" + result);
        } else {
            if (result.charAt(result.length() - 1) == ' ') {
                result.deleteCharAt(result.length() - 2);
                result.setCharAt(result.length() - 2, '.');
                System.out.println("->" + result);
            }
            else{
                result.setCharAt(result.length() - 1, '.');
                System.out.println("->" + result);
            }
        }
    }
}

