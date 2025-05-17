package javacc;

public class HelloBiodome04 {

	public static void main(String[] args) {
		if (args.length != 3) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
            System.exit(1);
        }

		double temp = 0.0, humidity = 0.0, oxygen = 0.0;

		try {
		    temp = Double.parseDouble(args[0]);
		    humidity = Double.parseDouble(args[1]);
		    oxygen = Double.parseDouble(args[2]);
		} catch (NumberFormatException e) {
		    System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
		    System.exit(1);
		}
		
		// 온도    10 <= temp < 27.5
		// 습도    40 < humidity < 60
		// 산소농도 19.5 <= oxygen <= 23.5
		
        boolean isTempSafe = isTempInRange(temp);
        boolean isHumiditySafe = isHumidityInRange(humidity);
        boolean isOxygenSafe = isOxygenInRange(oxygen);



        if (isTempSafe && isHumiditySafe && isOxygenSafe) {
            System.out.println("생명의 나무는 안정적인 상태입니다 :)");

        } else {
        	if (!isTempSafe && !isHumiditySafe) {
        		System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
        	} else if (!isTempSafe) {
                System.out.println("온도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
            } else if (!isHumiditySafe) {
                System.out.println("습도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
            } else if (!isOxygenSafe) {
                System.out.println("산소 농도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
            }
        }
	}
	
	

    static boolean isTempInRange(double t) {
        return t >= 10 && t < 27.5;
    }

    static boolean isHumidityInRange(double h) {
        return h > 40.0 && h <= 60.0;
    }

    static boolean isOxygenInRange(double o) {
        return o >= 19.5 && o <= 23.5;
    }
}
