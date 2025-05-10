package javacc;

public class HelloBiodome03 {

	public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
            System.exit(1);
        }

        double temperature, humidity, oxygen;

        try {
            temperature = Double.parseDouble(args[0]);
            humidity = Double.parseDouble(args[1]);
            oxygen = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
            return;
        }

        double muB = 0.415;
        double pi = 3.14;

        double rootHumidity = sqrt(humidity);  // 습도
        double absPart = abs(rootHumidity - temperature);
        double h = calculateH(muB, absPart, oxygen, pi);

        System.out.println("생명지수 H = " + h);
        //System.out.printf("생명지수 H = %.2f", h);
    }

	
	
    public static double sqrt(double x) {
        double guess = x / 2.0;
        double epsilon = 0.1;
        while (abs(guess * guess - x) > epsilon) {
            guess = (guess + x / guess) / 2.0;
        }
        return guess;
    }


    public static double abs(double x) {
        return (x < 0) ? -x : x;
    }


    public static double calculateH(double muB, double absPart, double oxygen, double pi) {
        return muB * absPart + (oxygen / (pi * pi));
    }
}