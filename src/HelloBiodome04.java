public class HelloBiodome04 {
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
        System.out.printf("%f %f %f\n", t, h , o);

        int flag = 1;
        if (flag == 1) {
            if(treeCheck(flag, t)) flag += 1;
            else System.out.println("-> 온도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
        }
        if(flag == 2) {
            if(treeCheck(flag, h)) flag += 1;
            else System.out.println("-> 습도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
        }
        if(flag == 3) {
            if(treeCheck(flag, o)) System.out.println("-> 생명의 나무는 안정적인 상태입니다 :)");
            else System.out.println("-> 산소농도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
        }
    }

    public static boolean treeCheck(int flag, double num) {
        if (flag == 1) {
            if (num >= 10 && num < 27.5) return true;
            else return false;
        } else if (flag == 2) {
            if (num > 40 && num < 60) return true;
            else return false;
        } else {
            if (num >= 19.5 && num <= 23.5) return true;
            else return false;
        }
    }

}
