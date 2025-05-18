package HelloBiodome03;
public class HelloBiodome03 {

    public static final double K = 0.415;
    public static final double PI_SQUARED = 9.8696044011;

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("입력값 부족");
            return;
        }

        try {
            double temperature = Double.parseDouble(args[0]);
            double humidity = Double.parseDouble(args[1]);
            double oxygen = Double.parseDouble(args[2]);

            double rootHumidity = customSqrt(humidity);
            double absDiff = customAbs(rootHumidity - temperature);
            double oxygenTerm = oxygen / PI_SQUARED;
            double hIndex = K * absDiff + oxygenTerm;

            System.out.printf("생명지수 H = %.10f\n", hIndex);

        } catch (NumberFormatException e) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
        }
    }

    public static double customSqrt(double x) {
        if (x < 0) return -1;
        double guess = x / 2.0;
        double epsilon = 0.00000001;
        while ((guess * guess - x) > epsilon || (x - guess * guess) > epsilon) {
            guess = (guess + x / guess) / 2.0;
        }
        return guess;
    }

    public static double customAbs(double x) {
        return x < 0 ? -x : x;
    }
}
