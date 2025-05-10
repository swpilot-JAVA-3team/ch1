public class HelloBiodome03 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요.");
            System.exit(1);
        }

        for(String i : args){
            try {
                double n = Double.valueOf(i);
            } catch (NumberFormatException e) {
                System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요.");
                System.exit(1);
            }
        }

        double t = Double.valueOf(args[0]);
        double h = Double.valueOf(args[1]);
        double o = Double.valueOf(args[2]);
        double pi = 3.14;
        System.out.printf("%f %f %f\n", t, h, o);

        h = squareRoot(h);

        double result = treeH(t, h, o, pi);
        System.out.println("-> 생명지 H = " + result);
    }

    public static double squareRoot(double num) {
        //바빌로니아 점화식
        double hs = 1;
        for (int i = 0; i < 1000; i++) {
            hs = (hs + (num / hs)) / 2;
        }
        return hs;
    }

    public static double absoluteValue(double num1, double num2) {
        if ( num1 - num2 >= 0)
            return num1 - num2;
        else
            return (num1 - num2) * (-1);
    }

    public static double treeH(double t, double h, double o, double pi) {
        return ((0.415 * absoluteValue(h, t)) + (o / (pi * pi)));
    }
}
