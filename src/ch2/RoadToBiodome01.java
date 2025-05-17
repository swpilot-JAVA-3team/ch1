package ch2;
import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome01 {
    public static void main(String[] args) {
        try {
            List<Integer> nums = new ArrayList<>();

            for(int i = 0; i < args.length; i++) {
                if (Integer.parseInt(args[i]) < 0 | Integer.parseInt(args[i]) > 1000) {
                    System.out.println("-> 입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                    System.exit(1);
                }
                else {
                    nums.add(Integer.parseInt(args[i]));
                }
            }
            System.out.println(nums);
            System.out.println("-> " + findnum(nums));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-> 입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
            System.exit(1);
        } catch (NumberFormatException e) {
            System.out.println("-> 입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
            System.exit(1);
        }
    }

    public static int findnum (List<Integer> nums) {
        int[] cnt = new int[1000];
        for(Integer num : nums) {
            cnt[num]++;
        }

        for (int i = 0; i < 1000; i++) {
            if (cnt[i] == 1) {
                return i;
            }
        }

        return -1;
    }
}
