public class HelloBiodome06 {
    public static void main(String[] args) {
        try {
            String gene1 = args[0];
            System.out.printf("%s ", gene1);
            String gene2 = args[1];
            System.out.printf("%s\n", gene2);

            int gene1len = gene1.length();
            int gene2len = gene2.length();

            int i = 0;
            if (gene1len != gene2len) {
                System.out.printf("-> 일치하지 않습니다.");
                System.exit(1);
            }
            while (i < gene1len) {
                if (gene1.charAt(i) != gene2.charAt(i)) {
                    break;
                }
                i += 1;
            }
            if (i != gene1len) {
                System.out.println("-> 일치하지 않습니다.");
            } else {
                System.out.println("-> 동일한 유전자 코드입니다.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n->두 개의 유전자 코드를 입력해주세요.");
            System.exit(1);
        }
    }
}