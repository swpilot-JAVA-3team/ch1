package no01;
import java.util.ArrayList;
import java.util.List;
public class RoadToBiodome01 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("입력 형식이 올바르지 않습니다. 예: \"[51, 7, 109]\"");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg).append(" ");
        }
        String input = sb.toString().trim();

        if (!input.startsWith("[") || !input.endsWith("]")) {
            System.out.println("입력 형식이 올바르지 않습니다. 예: \"[51, 7, 109]\"");
            return;
        }

        input = input.substring(1, input.length() - 1).trim();
        if (input.isEmpty()) {
            System.out.println("입력된 배열이 비어 있습니다.");
            return;
        }

        String[] tokens = input.split(",");
        List<Integer> numbers = new ArrayList<>();

        for (String token : tokens) {
            try {
                int num = Integer.parseInt(token.trim());
                if (num < 0 || num > 1000) {
                    System.out.println("범위가 올바르지 않습니다.");
                    return;
                }
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아닌 값이 포함되어 있습니다.");
                return;
            }
        }

        List<Integer> uniques = new ArrayList<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : numbers) {
            if (duplicates.contains(num)) {
                continue;
            } else if (uniques.contains(num)) {
                uniques.remove((Integer) num);
                duplicates.add(num);
            } else {
                uniques.add(num);
            }
        }

        if (uniques.size() > 0) {
            System.out.println(uniques.get(0));
        } else {
            System.out.println("반복되지 않는 숫자가 없습니다.");
        }
    }
}
