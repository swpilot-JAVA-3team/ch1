
public class HelloBiodome09 {
    public static void main(String[] args) {
        // 입력값이 있는지 확인
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

        // 숫자 범위 확인
        if (height < 3 || height > 100) {
            System.out.println("invaild input, please select number between 3~100");
            return;
        }

        // 나무 그리기
        for (int i = 0; i < height; i++) {
            int starCount = 1 + 2 * i;
            int spaces = height - i - 1;

            // 공백 출력
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 기둥 그리기 (중앙 정렬)
        for (int j = 0; j < height - 1; j++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}

