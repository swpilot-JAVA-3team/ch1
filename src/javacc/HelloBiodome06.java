package javacc;

public class HelloBiodome06 {

	public static void main(String[] args) {
		if (args.length != 2) {
            System.out.println("두 개의 유전자 코드를 입력해주세요.");
            return;
        }

        String gene1 = args[0];
        String gene2 = args[1];


        if (gene1.length() != gene2.length()) {
            System.out.println("일치하지 않습니다.");
            return;
        }

        boolean isSame = true;

        int index = 0;
        while (index < gene1.length()) {
            if (gene1.charAt(index) != gene2.charAt(index)) {
                isSame = false;
                break;
            }
            index++;
        }

        if (isSame) {
            System.out.println("동일한 유전자 코드입니다.");
        } else {
            System.out.println("일치하지 않습니다.");
        }
    }
}