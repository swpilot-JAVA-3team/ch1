package subject2;

public class RoadToBiodome05 {

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

        String[] water1_remove = parts[0].replace("[", "").split(",");
        String[] water2_remove = parts[1].replace("]", "").split(",");

        int[] water1 = new int[water1_remove.length];
        int[] water2 = new int[water2_remove.length];

        if (!parseInput(water1_remove, water1) || !parseInput(water2_remove, water2)) {
            System.out.println("물 높이는 0 이상의 값이어야 합니다.");
            return;
        }

        // 배열 병합
        int[] merged = new int[water1.length + water2.length];
        for (int i = 0; i < water1.length; i++) {
            merged[i] = water1[i];
        }
        for (int i = 0; i < water2.length; i++) {
            merged[water1.length + i] = water2[i];
        }

        // 퀵 정렬 수행
        quickSort(merged, 0, merged.length - 1);

        
        // 최종 출력
        System.out.print("[");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
            if (i < merged.length - 1) System.out.print(",");
        }
        System.out.println("]");
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

    // 퀵 정렬
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 피벗을 기준으로 배열을 분할하고 피벗 인덱스를 반환
            int pivotIndex = partition(arr, low, high);
            // 피벗을 기준으로 왼쪽 부분 배열을 정렬
            quickSort(arr, low, pivotIndex - 1);
            // 피벗을 기준으로 오른쪽 부분 배열을 정렬
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // 배열을 피벗을 기준으로 분할하고 피벗 인덱스를 반환하는 함수
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        // 피벗보다 작은 원소들을 배열의 왼쪽에 배치
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        // 피벗을 배열의 중앙에 배치하고 인덱스를 반환
        swap(arr, i + 1, high);
        return i + 1;
    }

    // 두 배열 원소를 서로 교환하는 함수
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}