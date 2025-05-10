public class HelloBiodome02 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("에너지 값을 3개 입력하세요.");
            System.exit(1);
        }

        for(String i : args){
            try {
                int n = Integer.parseInt(i);
                if (n < 0 || n > 30000) {
                    System.out.println("숫자 범위는 0부터 30000입니다.");
                    System.exit(1);
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아닌 값이 입력되었습니다.");
                System.exit(1);
            }
        }
        int solar = Integer.parseInt(args[0]);
        int wind = Integer.parseInt(args[1]);
        int geo = Integer.parseInt(args[2]);

        int sum = solar + wind + geo;
        double solarper = (double) solar / (double) sum * 100;
        double windper = (double) wind / (double) sum * 100;
        double geoper = (double) geo / (double) sum * 100;

        System.out.printf("%d %d %d\n", solar , wind , geo);
        System.out.println("-> 총 에너지 사용량은 " + sum + "입니다.");
        System.out.println("태양광 " + solarper + ", 풍력 " + windper + ", 지열 " + geoper);
    }
}
