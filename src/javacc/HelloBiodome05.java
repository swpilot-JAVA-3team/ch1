package javacc;

public class HelloBiodome05 {

    static int g;
    static int h;

    public static void findValid() {
    	for (int gg = 0; gg < 16; gg++) {
            for (int hh = 0; hh < 16; hh++) {
            	//① g & 1 >> g << 2 | h + g ^ h == 1
            	//② g % 2 << h >> g | 1 & 0 ^ 0 == 2
            	int expr1 = ((gg & ((1 >> gg) << 2)) | ((hh + gg) ^ hh));
                int expr2 = (((gg % 2) << hh) >> gg);

                if (expr1 == 1 && expr2 == 2) {
                    g = gg;
                    h = hh;
                    return;
                }
            }
        }
    }


    public static int resultCalculate() {
    	//③ (h * h + g) * (h << h) + (g << g) = ? 
        return (h * h + g) * (h << h) + (g << g);
    }


    public static void main(String[] args) {
        findValid();
        int result = resultCalculate();
        System.out.println(result);
    }
}