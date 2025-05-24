package no05;

public class RoadToBiodome05 {
	public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("오류: 두 개의 배열을 입력해야 합니다.");
            return;
        }

        int[] array1 = parseArray(args[0]);
        int[] array2 = parseArray(args[1]);

        if (array1 == null || array2 == null) {
            // 안내 메시지는 parseArray 내부에서 출력함
            return;
        }

        // 여기서부터 배열 합치고 정렬하는 코드 작성하면 됨
    }

    private static int[] parseArray(String input) {
        input = input.trim();

        if (!input.startsWith("[") || !input.endsWith("]")) {
            System.out.println("오류: 배열은 대괄호 [ ] 안에 있어야 합니다.");
            return null;
        }

        String inner = input.substring(1, input.length() - 1).trim();
        if (inner.isEmpty()) return new int[0];

        String[] parts = inner.split(",");
        int[] result = new int[parts.length];

        try {
            for (int i = 0; i < parts.length; i++) {
                int value = Integer.parseInt(parts[i].trim());
                if (value < 0) {
                    System.out.println("오류: 물 높이는 음수가 될 수 없습니다.");
                    return null;
                }
                result[i] = value;
            }
        } catch (NumberFormatException e) {
            System.out.println("오류: 숫자가 아닌 값이 포함되어 있습니다.");
            return null;
        }

        return result;
    }

}
