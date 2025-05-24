package subject2;
import java.util.Arrays;

public class RoadToBiodome06 {

	public static void main(String[] args) {
		String input = String.join(" ", args);
		
		if (!input.contains("] [")) {
            System.out.println("두 개의 배열을 입력해주세요.");
            return;
        }

        String[] parts = input.split("\\] \\[");
        if (parts.length != 2) {
            System.out.println("배열 2개가 정확히 입력돼야 합니다.");
            return;
        }
		
		String[] lake_remove = parts[0].replace("[", "").replace("]", "").split(",");
        String[] river_remove = parts[1].replace("[", "").replace("]", "").split(",");
        
        
        int[] lake = new int[lake_remove.length];
        int[] river = new int[river_remove.length];
        
        if (!parseInput(lake_remove, lake) || !parseInput(river_remove, river)) {
            System.out.println("물 높이는 0 이상의 값이어야 합니다.");
            return;
        }
        
        Arrays.sort(lake);
        Arrays.sort(river);
        
        double mean = calculateMean(lake, river);
        double median = calculateMedian(lake, river);

        System.out.printf("Mean : %.1f, Median : %.1f%n", mean, median);

	}
	
	// 유효성 검사
	public static boolean parseInput(String[] input, int[] result) {
        for (int i = 0; i < input.length; i++) {
            try {
                int val = Integer.parseInt(input[i].trim());
                if (val < 0) return false;
                result[i] = val;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
	
	// 평균
	private static double calculateMean(int[] lake, int[] river) {
        int sum = 0;
        for (int n : lake) sum += n;
        for (int n : river) sum += n;
        return (double)sum / (lake.length + river.length);
    }
	
	// 중간값
	private static double calculateMedian(int[] lake, int[] river) {
        if (lake.length > river.length)
        {
        	return calculateMedian(river, lake);
        }

        final int n = lake.length;
        final int m = river.length;
        int left = 0, right = n;
        while (left <= right)
        {
            int i = (right - left + 1) / 2 + left;
            int j = (n + m + 1) / 2 - i;
            int nums1_1 = i > 0 ? lake[i - 1] : Integer.MIN_VALUE;
            int nums1_2 = i < n ? lake[i] : Integer.MAX_VALUE;
            int nums2_1 = j > 0 ? river[j - 1] : Integer.MIN_VALUE;
            int nums2_2 = j < m ? river[j] : Integer.MAX_VALUE;
            if (nums1_1 > nums2_2)
            {
                right = i - 1;
            }
            else if (nums2_1 > nums1_2)
            {
                left = i + 1;
            }
            else
            {
                int leftMax = Math.max(nums1_1, nums2_1);
                int rightMin = Math.min(nums1_2, nums2_2);
                if (0 != (n + m) % 2)
                {
                    return leftMax;
                }
                else
                {
                    return (leftMax + rightMin) / 2.0;
                }
            }
        }

        return 0.0;
    }
}
