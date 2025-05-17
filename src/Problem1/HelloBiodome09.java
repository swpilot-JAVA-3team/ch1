package Problem1;

public class HelloBiodome09 {
    public static void main(String[] args) {
 
        if (args.length != 1) {
            System.out.println("invaild input, please select number between 3~100");
            return;
        }

        int height = 0;

        try {
            height = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("invaild input, please select number between 3~100");
            return;
        }

        if (height < 3 || height > 100) {
            System.out.println("invaild input, please select number between 3~100");
            return;
        }

        // tree
        for (int i = 0; i < height; i++) {
            int starCount = 1 + 2 * i;
            int spaces = height - i - 1;

           
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 기둥 
        for (int j = 0; j < height - 1; j++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}

