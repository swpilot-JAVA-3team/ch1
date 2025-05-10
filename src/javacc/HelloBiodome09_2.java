package javacc;

public class HelloBiodome09_2 {

	public static void main(String[] args) {
		if (args.length < 1 || args.length > 2) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
            System.exit(1);
        }

		int height;
        char specialChar = '&';

        
        try {
            height = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
            return;
        }
        if (height < 3 || height > 100) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
            return;
        }



        if (args.length == 2 && args[1].length() == 1) {
            specialChar = args[1].charAt(0);
        }



        for (int i = 0; i < height; i++) {
            int spaces = height - i - 1;
            int stars = 2 * i + 1;
            int center = stars / 2;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                if (j == center) {
                    System.out.print(specialChar);
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
