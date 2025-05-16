public class HelloBiodome05 {
    public static void main(String[] args) {
        int[] result = sol();
        int g = result[0];
        int h = result[1];

        if (g == -1) {
            System.out.println("No solution found.");
        } else {
            System.out.println(ans(g, h));
        }
    }

    public static int[] sol() {
        for (int g = 0; g < 16; g++) {
            for (int h = 0; h < 16; h++) {
                int result1 = ((g & 1) >> g << 2) | ((h + g) ^ h);
                int result2 = ((g % 2) << h >> g) | ((1 & 0) ^ 0);
                if (result1 == 1 && result2 == 2) {
                    return new int[]{g, h};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int ans(int g, int h) {
        return (h * h + g) * (h << h) + (g << g);
    }
}