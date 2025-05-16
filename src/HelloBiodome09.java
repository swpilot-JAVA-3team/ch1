public class HelloBiodome09 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            if (num < 3 || num > 100){
                System.out.println("잘못된 입력입니다. 3~100사이의 숫자를 입력하세요");
                System.exit(1);
            }

            for (int i = 0; i < num; i++){
                for (int j = 0; j + i < num ; j++) System.out.printf(" ");
                for (int k = 0; k < i; k++) System.out.printf("*");
                System.out.printf("*");
                for (int k = 0; k < i; k++) System.out.printf("*");
                for (int j = 0; j + i < num ; j++) System.out.printf(" ");
                System.out.println("");
            }

            for (int i = 0; i < num; i++){
                System.out.printf(" ");
            }
            System.out.println("|");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 입력입니다. 3~100사이의 숫자를 입력하세요");
            System.exit(1);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 3~100사이의 숫자를 입력하세요");
            System.exit(1);
        }
    }
}
