public class HelloBiodome08 {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder(args[0]);
        System.out.println(line);
        String[] words = {"hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please", "need", "we", "isn't", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can"};

        for (String word : words) {
            int index = line.indexOf(word);

            if (index > 0) {
                line.insert(index, " ");
                if (index + word.length() + 1 < line.length() - 2) line.insert(index + word.length() + 1, " ");
            }
        }

        while (line.toString().contains("  ")) {
            line = new StringBuilder(line.toString().replace("  ", " "));
        }

        if (line.charAt(line.length() - 1) != '?') {
            System.out.println("->" + line);
        } else {
            // 마지막 문자가 '?'일 때만 '?' → '.' 교체
            line.setCharAt(line.length() - 1, '.');
            System.out.println("->" + line);
        }
    }
}
