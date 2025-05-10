package javacc;

public class HelloBiodome02 {

	public static void main(String[] args) {
		if (args.length != 3) {
            System.out.println("에너지 생산량 3가지를 정확히 입력해주세요.");
            System.exit(1);
        }

        int solar = 0;
        int wind = 0;
        int geothermal = 0;

        solar = Integer.parseInt(args[0]);
        wind = Integer.parseInt(args[1]);
        geothermal = Integer.parseInt(args[2]);

        if (solar < 0 || wind < 0 || geothermal < 0) {
            System.out.println("에너지 생산량은 음수일 수 없습니다.");
            System.exit(1);
        }

        if (solar > 30000 || wind > 30000 || geothermal > 30000) {
            System.out.println("각 에너지 생산량은 최대 30000까지 입력 가능합니다.");
            System.exit(1);
        }

        int total = solar + wind + geothermal;
        System.out.println("총 에너지 사용량은 " + total + "입니다.");

        
        // 보너스
        double solarRatio = (solar * 100.0) / total;
        double windRatio = (wind * 100.0) / total;
        double geoRatio = (geothermal * 100.0) / total;

        System.out.printf("태양광 %.9f%%, 풍력 %.9f%%, 지열 %.9f%%", solarRatio, windRatio, geoRatio);
	}

}
