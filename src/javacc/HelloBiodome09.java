package javacc;

public class HelloBiodome09 {

	public static void main(String[] args) {
		if (args.length != 1) {
            System.out.println("잘못된 입력입니다. 3~100 사이의 숫자를 입력하세요.");
            System.exit(1);
        }

        int height;


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



        for (int i = 0; i < height; i++) {
            int spaces = height - i - 1;
            int stars = 2 * i + 1;

            
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
