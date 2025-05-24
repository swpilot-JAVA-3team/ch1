package ch2;

import java.util.*;

public class RoadToBiodome05 {
    public static void main(String[] args) {
        try {
            String input = String.join(",", args);
            String[] tokens = input.split(",");

            List<Integer> numbers = new ArrayList<>();
            for (String token : tokens) {
                numbers.add(Integer.parseInt(token.trim()));
            }

            System.out.println("정렬 전: " + numbers);
            quickSort(numbers, 0, numbers.size() - 1);
            System.out.println("정렬 후: " + numbers);

        } catch (Exception e) {
            System.out.println("입력이 잘못되었습니다.");
            System.exit(1);
        }
    }

    // 왼쪽 피벗 퀵 정렬 구현
    public static void quickSort(List<Integer> arr, int left, int right) {
        if (left >= right) return;

        int pivot = arr.get(left);  // 왼쪽 피벗
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= right && arr.get(i) <= pivot) i++;
            while (j > left && arr.get(j) >= pivot) j--;
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, left, j);  // 피벗과 j 교환
        quickSort(arr, left, j - 1);
        quickSort(arr, j + 1, right);
    }

    public static void swap(List<Integer> arr, int i, int j) {
        int tmp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, tmp);
    }
}